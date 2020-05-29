package com.ischoolbar.programmer.service.common;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ischoolbar.programmer.entity.common.Product;

/**
 * ���Ľӿ�
 * @author 12753
 *
 */
@Service
public interface ProductService {
	
	/**
	 * ���ӽ���
	 * @param productCategory
	 * @return
	 */
	public int add(Product product);
	
	/**
	 * �༭����
	 * @param productCategory
	 * @return
	 */
	public int edit(Product product);
	
	/**
	 * ɾ������
	 * @param id
	 * @return
	 */
	public int delete(Long id);
	
	/**
	 * �����������ʲ�ѯ����
	 * @param queMap
	 * @return
	 */
	public List<Product> findList(Map<String, Object> queryMap);
	
	/**
	 * ��ȡ�����������ܼ�¼��
	 * @param queryMap
	 * @return
	 */
	public Integer getTotal(Map<String, Object> queryMap);
	
	/**
	 * ����id��ѯ����
	 * @param id
	 * @return
	 */
	public Product findById(Long id);
	
	/**
	 * ����ͳ����Ϣ
	 * @param product
	 * @return
	 */
	public int updateNum(Product product);
}