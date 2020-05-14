package com.ischoolbar.programmer.controller.admin;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView list(ModelAndView model){
		model.setViewName("product_category/list");
		return model;
	}
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
}
