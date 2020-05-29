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
>>>>>>> Âª∫Êùê‰πãÂÆ∂
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
<<<<<<< HEAD
import org.springframework.web.servlet.ModelAndView;

import com.ischoolbar.programmer.page.admin.Page;

/**
 * Âª∫ÊùêÂàÜÁ±ªÁÆ°ÁêÜÊéßÂà∂Âô®
 * @author 12753
 *
 */
@RequestMapping("admin/product_category/list")
@Controller
public class ProductCategoryController {

	/**
	 * Âª∫ÊùêÂàÜÁ±ªÂàóË°®È°µ
=======
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ischoolbar.programmer.entity.common.ProductCategory;
import com.ischoolbar.programmer.page.admin.Page;
import com.ischoolbar.programmer.service.common.ProductCategoryService;

/**
 * Ω®≤ƒ∑÷¿‡π‹¿Ìøÿ÷∆∆˜
 * @author 12753
 *
 */
@RequestMapping("/admin/product_category")
@Controller
public class ProductCategoryController {
	
	@Autowired
	private ProductCategoryService productCategoryService;
	
	
	/**
	 * Ω®≤ƒ∑÷¿‡¡–±Ì“≥
>>>>>>> Âª∫Êùê‰πãÂÆ∂
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
	 * ≤È—ØΩ®≤ƒ∑÷¿‡¡–±Ì
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
	 * ∑µªÿ ˜–Œ∑÷¿‡
	 * @return
	 */
	@RequestMapping(value="/tree_list",method=RequestMethod.POST)
	@ResponseBody
	public List<Map<String, Object>> treeList(){
		Map<String, Object> queryMap = new HashMap<String, Object>();
		return getTreeCategory(productCategoryService.findList(queryMap));
	}
	
	/**
	 * ÃÌº”Ω®≤ƒ∑÷¿‡
	 * @param productCategory
	 * @return
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> add(ProductCategory productCategory){
		Map<String, Object> ret = new HashMap<String, Object>();
		if(productCategory == null){
			ret.put("type", "error");
			ret.put("msg", "«ÎÃÓ–¥’˝»∑µƒ∑÷¿‡–≈œ¢");
			return ret;
		}
		if(StringUtils.isEmpty(productCategory.getName())){
			ret.put("type", "error");
			ret.put("msg", "«ÎÃÓ–¥∑÷¿‡√˚≥∆");
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
			ret.put("msg", "ÃÌº” ß∞‹£¨«Î¡™œµπ‹¿Ì‘±!");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "ÃÌº”≥…π¶!");
		return ret;
	}
	
	/**
	 * ±‡º≠Ω®≤ƒ∑÷¿‡
	 * @param productCategory
	 * @return
	 */
	@RequestMapping(value="/edit",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> edit(ProductCategory productCategory){
		Map<String, Object> ret = new HashMap<String, Object>();
		if(productCategory == null){
			ret.put("type", "error");
			ret.put("msg", "«ÎÃÓ–¥’˝»∑µƒ∑÷¿‡–≈œ¢");
			return ret;
		}
		if(StringUtils.isEmpty(productCategory.getName())){
			ret.put("type", "error");
			ret.put("msg", "«ÎÃÓ–¥∑÷¿‡√˚≥∆");
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
			ret.put("msg", "±‡º≠ ß∞‹£¨«Î¡™œµπ‹¿Ì‘±!");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "±‡º≠≥…π¶!");
		return ret;
	}
	
	/**
	 * …æ≥˝Ω®≤ƒ∑÷¿‡
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> delete(Long id){
		Map<String, Object> ret = new HashMap<String, Object>();
		if(id == null){
			ret.put("type", "error");
			ret.put("msg", "«Î—°‘Ò“™…æ≥˝µƒ∑÷¿‡");
			return ret;
		}
		
		try {
			if(productCategoryService.delete(id) <= 0){
				ret.put("type", "error");
				ret.put("msg", "…æ≥˝ ß∞‹£¨«Î¡™œµπ‹¿Ì‘±!");
				return ret;
			}
		} catch (Exception e) {
			// TODO: handle exception
			ret.put("type", "error");
			ret.put("msg", "∏√∑÷¿‡œ¬¥Ê‘⁄Ω®≤ƒ–≈œ¢£¨≤ª‘ –Ì…æ≥˝!");
			return ret;
		}
		
		ret.put("type", "success");
		ret.put("msg", "…æ≥˝≥…π¶!");
		return ret;
	}
	
	/**
	 * ∏˘æ›¡–±Ì…˙≥…∂˛º∂ ˜–Œπÿœµ∑÷¿‡
	 * @param productCategorieList
	 * @return
	 */
	private List<Map<String, Object>> getTreeCategory(List<ProductCategory> productCategorieList){
		List<Map<String, Object>> ret = new ArrayList<Map<String,Object>>();
		//À˘”–µƒ∏∏∑÷¿‡’˚¿Ì
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
>>>>>>> Âª∫Êùê‰πãÂÆ∂
}
