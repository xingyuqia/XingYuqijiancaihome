package com.ischoolbar.programmer.service.common;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ischoolbar.programmer.entity.common.ProductCategory;

/**
 * 建材分类接口
 * @author 12753
 *
 */
@Service
public interface ProductCategoryService {

	/**
	 * 添加建材分类
	 * @param productCategory
	 * @return
	 */
	public int add(ProductCategory productCategory);
	
	/**
	 * 编辑建材分类
	 * @param productCategory
	 * @return
	 */
	public int edit(ProductCategory productCategory);
	
	/**
	 * 删除建材分类
	 * @param productCategory
	 * @return
	 */
	public int delete(Long id);
	
	/**
	 * 多条件搜索查询建材分类
	 * @param productCategory
	 * @return
	 */
	public List<ProductCategory> findList(Map<String,Object> queMap);
}
