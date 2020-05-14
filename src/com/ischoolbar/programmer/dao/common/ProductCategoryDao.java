package com.ischoolbar.programmer.dao.common;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ischoolbar.programmer.entity.common.ProductCategory;

/**
 * 建材分类dao层
 * @author 12753
 *
 */
@Repository
public interface ProductCategoryDao {

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
