package com.ischoolbar.programmer.dao.common;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ischoolbar.programmer.entity.common.Product;

/**
 * 建材dao层
 * @author 12753
 *
 */
@Repository
public interface ProductDao {
	/**
	 * 添加建材
	 * @param productCategory
	 * @return
	 */
	public int add(Product product);
	
	/**
	 * 编辑建材
	 * @param productCategory
	 * @return
	 */
	public int edit(Product product);
	
	/**
	 * 删除建材
	 * @param id
	 * @return
	 */
	public int delete(Long id);
	
	/**
	 * 多条件搜索词查询建材
	 * @param queMap
	 * @return
	 */
	public List<Product> findList(Map<String, Object> queryMap);
	
	/**
	 * 获取符合条件的总记录数
	 * @param queryMap
	 * @return
	 */
	public Integer getTotal(Map<String, Object> queryMap);
	
	/**
	 * 根据id查询建材
	 * @param id
	 * @return
	 */
	public Product findById(Long id);
	
	/**
	 * 更新统计信息
	 * @param product
	 * @return
	 */
	public int updateNum(Product product);
}
