package com.ischoolbar.programmer.controller.admin;

<<<<<<< HEAD
import java.util.HashMap;
import java.util.Map;

=======
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> 建材之家
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
<<<<<<< HEAD
import org.springframework.web.servlet.ModelAndView;

import com.ischoolbar.programmer.page.admin.Page;

/**
 * 建材分类管理控制器
 * @author 12753
 *
 */
@RequestMapping("admin/product_category/list")
@Controller
public class ProductCategoryController {

	/**
	 * 建材分类列表页
=======
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ischoolbar.programmer.entity.common.ProductCategory;
import com.ischoolbar.programmer.page.admin.Page;
import com.ischoolbar.programmer.service.common.ProductCategoryService;

/**
 * ���ķ�����������
 * @author 12753
 *
 */
@RequestMapping("/admin/product_category")
@Controller
public class ProductCategoryController {
	
	@Autowired
	private ProductCategoryService productCategoryService;
	
	
	/**
	 * ���ķ����б�ҳ
>>>>>>> 建材之家
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView list(ModelAndView model){
		model.setViewName("product_category/list");
		return model;
	}
<<<<<<< HEAD
	@RequestMapping(value="/list",method=RequestMethod.POST)
	public Map<String,Object> list(@RequestParam(name="name",defaultValue="")String name,
			    Page page
			){
		Map<String,Object> ret = new HashMap<String,Object>();
		Map<String,Object> queryMap = new HashMap<String,Object>();
		queryMap.put("name", name);
		queryMap.put("offset", page.getOffset());
		queryMap.put("pageSize", page.getRows());
		return ret;
	} 
=======
	
	/**
	 * ��ѯ���ķ����б�
	 * @param name
	 * @param page
	 * @return
	 */
	@RequestMapping(value="/list",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> list(@RequestParam(name="name",defaultValue="")String name,
				Page page
			){
		Map<String, Object> ret = new HashMap<String, Object>();
		Map<String, Object> queryMap = new HashMap<String, Object>();
		queryMap.put("name", name);
		//queryMap.put("offset", page.getOffset());
		//queryMap.put("pageSize", page.getRows());
		ret.put("rows", productCategoryService.findList(queryMap));
		ret.put("total", productCategoryService.getTotal(queryMap));
		return ret;
	}
	
	/**
	 * �������η���
	 * @return
	 */
	@RequestMapping(value="/tree_list",method=RequestMethod.POST)
	@ResponseBody
	public List<Map<String, Object>> treeList(){
		Map<String, Object> queryMap = new HashMap<String, Object>();
		return getTreeCategory(productCategoryService.findList(queryMap));
	}
	
	/**
	 * ��ӽ��ķ���
	 * @param productCategory
	 * @return
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> add(ProductCategory productCategory){
		Map<String, Object> ret = new HashMap<String, Object>();
		if(productCategory == null){
			ret.put("type", "error");
			ret.put("msg", "����д��ȷ�ķ�����Ϣ");
			return ret;
		}
		if(StringUtils.isEmpty(productCategory.getName())){
			ret.put("type", "error");
			ret.put("msg", "����д��������");
			return ret;
		}
		if(productCategory.getParentId() != null){
			ProductCategory productCategoryParent = productCategoryService.findById(productCategory.getParentId());
			if(productCategoryParent != null){
				String tags = "";
				if(productCategoryParent.getTags() != null){
					tags += productCategoryParent.getTags() + ",";
				}
				productCategory.setTags(tags + productCategory.getParentId());
			}
		}
		if(productCategoryService.add(productCategory) <= 0){
			ret.put("type", "error");
			ret.put("msg", "���ʧ�ܣ�����ϵ����Ա!");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "��ӳɹ�!");
		return ret;
	}
	
	/**
	 * �༭���ķ���
	 * @param productCategory
	 * @return
	 */
	@RequestMapping(value="/edit",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> edit(ProductCategory productCategory){
		Map<String, Object> ret = new HashMap<String, Object>();
		if(productCategory == null){
			ret.put("type", "error");
			ret.put("msg", "����д��ȷ�ķ�����Ϣ");
			return ret;
		}
		if(StringUtils.isEmpty(productCategory.getName())){
			ret.put("type", "error");
			ret.put("msg", "����д��������");
			return ret;
		}
		if(productCategory.getParentId() != null){
			ProductCategory productCategoryParent = productCategoryService.findById(productCategory.getParentId());
			if(productCategoryParent != null){
				String tags = "";
				if(productCategoryParent.getTags() != null){
					tags += productCategoryParent.getTags() + ",";
				}
				productCategory.setTags(tags + productCategory.getParentId());
			}
		}
		if(productCategoryService.edit(productCategory) <= 0){
			ret.put("type", "error");
			ret.put("msg", "�༭ʧ�ܣ�����ϵ����Ա!");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "�༭�ɹ�!");
		return ret;
	}
	
	/**
	 * ɾ�����ķ���
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> delete(Long id){
		Map<String, Object> ret = new HashMap<String, Object>();
		if(id == null){
			ret.put("type", "error");
			ret.put("msg", "��ѡ��Ҫɾ���ķ���");
			return ret;
		}
		
		try {
			if(productCategoryService.delete(id) <= 0){
				ret.put("type", "error");
				ret.put("msg", "ɾ��ʧ�ܣ�����ϵ����Ա!");
				return ret;
			}
		} catch (Exception e) {
			// TODO: handle exception
			ret.put("type", "error");
			ret.put("msg", "�÷����´��ڽ�����Ϣ��������ɾ��!");
			return ret;
		}
		
		ret.put("type", "success");
		ret.put("msg", "ɾ���ɹ�!");
		return ret;
	}
	
	/**
	 * �����б����ɶ������ι�ϵ����
	 * @param productCategorieList
	 * @return
	 */
	private List<Map<String, Object>> getTreeCategory(List<ProductCategory> productCategorieList){
		List<Map<String, Object>> ret = new ArrayList<Map<String,Object>>();
		//���еĸ���������
		for(ProductCategory productCategory : productCategorieList){
			if(productCategory.getParentId() == null){
				Map<String, Object> top = new HashMap<String, Object>();
				top.put("id", productCategory.getId());
				top.put("text", productCategory.getName());
				top.put("children", new ArrayList<Map<String,Object>>());
				ret.add(top);
			}
		}
		for(ProductCategory productCategory : productCategorieList){
			if(productCategory.getParentId() != null){
				for(Map<String, Object> map : ret){
					if(productCategory.getParentId().longValue() == Long.valueOf(map.get("id")+"")){
						List children = (List)map.get("children");
						Map<String, Object> child = new HashMap<String, Object>();
						child.put("id", productCategory.getId());
						child.put("text", productCategory.getName());
						children.add(child);
					}
				}
			}
		}
		return ret;
	}
>>>>>>> 建材之家
}
