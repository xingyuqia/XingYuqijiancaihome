package com.ischoolbar.programmer.service.common;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ischoolbar.programmer.entity.common.ProductCategory;

/**
<<<<<<< HEAD
 * 建材分类接口
=======
 * ���ķ���ӿ�
>>>>>>> 建材之家
 * @author 12753
 *
 */
@Service
public interface ProductCategoryService {
<<<<<<< HEAD

	/**
	 * 添加建材分类
=======
	
	/**
	 * ��ӽ��ķ���
>>>>>>> 建材之家
	 * @param productCategory
	 * @return
	 */
	public int add(ProductCategory productCategory);
	
	/**
<<<<<<< HEAD
	 * 编辑建材分类
=======
	 * �༭���ķ���
>>>>>>> 建材之家
	 * @param productCategory
	 * @return
	 */
	public int edit(ProductCategory productCategory);
	
	/**
<<<<<<< HEAD
	 * 删除建材分类
	 * @param productCategory
=======
	 * ɾ�����ķ���
	 * @param id
>>>>>>> 建材之家
	 * @return
	 */
	public int delete(Long id);
	
	/**
<<<<<<< HEAD
	 * 多条件搜索查询建材分类
	 * @param productCategory
	 * @return
	 */
	public List<ProductCategory> findList(Map<String,Object> queMap);
=======
	 * �����������ʲ�ѯ���ķ���
	 * @param queMap
	 * @return
	 */
	public List<ProductCategory> findList(Map<String, Object> queryMap);
	
	/**
	 * ��ȡ�����������ܼ�¼��
	 * @param queryMap
	 * @return
	 */
	public Integer getTotal(Map<String, Object> queryMap);
	
	/**
	 * ����id��ѯ���ķ���
	 * @param id
	 * @return
	 */
	public ProductCategory findById(Long id);
>>>>>>> 建材之家
}
