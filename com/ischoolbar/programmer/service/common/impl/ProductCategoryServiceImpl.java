package com.ischoolbar.programmer.service.common.impl;
/**
<<<<<<< HEAD
 * 建材分类接口实现类
=======
 * ���ķ���ӿ�ʵ����
>>>>>>> 建材之家
 */
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ischoolbar.programmer.dao.common.ProductCategoryDao;
import com.ischoolbar.programmer.entity.common.ProductCategory;
import com.ischoolbar.programmer.service.common.ProductCategoryService;
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

	@Autowired
<<<<<<< HEAD
	private ProductCategoryDao productCategroDao;
=======
	private ProductCategoryDao productCategoryDao;
>>>>>>> 建材之家
	
	@Override
	public int add(ProductCategory productCategory) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		return productCategroDao.add(productCategory);
=======
		return productCategoryDao.add(productCategory);
>>>>>>> 建材之家
	}

	@Override
	public int edit(ProductCategory productCategory) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		return productCategroDao.edit(productCategory);
=======
		return productCategoryDao.edit(productCategory);
>>>>>>> 建材之家
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		return productCategroDao.delete(id);
=======
		return productCategoryDao.delete(id);
>>>>>>> 建材之家
	}

	@Override
	public List<ProductCategory> findList(Map<String, Object> queMap) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		return productCategroDao.findList(queMap);
=======
		return productCategoryDao.findList(queMap);
	}

	@Override
	public Integer getTotal(Map<String, Object> queryMap) {
		// TODO Auto-generated method stub
		return productCategoryDao.getTotal(queryMap);
	}

	@Override
	public ProductCategory findById(Long id) {
		// TODO Auto-generated method stub
		return productCategoryDao.findById(id);
>>>>>>> 建材之家
	}

}
