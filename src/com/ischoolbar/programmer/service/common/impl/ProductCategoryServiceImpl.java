package com.ischoolbar.programmer.service.common.impl;
/**
 * 建材分类接口实现类
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
	private ProductCategoryDao productCategroDao;
	
	@Override
	public int add(ProductCategory productCategory) {
		// TODO Auto-generated method stub
		return productCategroDao.add(productCategory);
	}

	@Override
	public int edit(ProductCategory productCategory) {
		// TODO Auto-generated method stub
		return productCategroDao.edit(productCategory);
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return productCategroDao.delete(id);
	}

	@Override
	public List<ProductCategory> findList(Map<String, Object> queMap) {
		// TODO Auto-generated method stub
		return productCategroDao.findList(queMap);
	}

}
