package com.ischoolbar.programmer.service.common;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ischoolbar.programmer.entity.common.ProductCategory;

/**
<<<<<<< HEAD
 * å»ºæåˆ†ç±»æ¥å£
=======
 * ½¨²Ä·ÖÀà½Ó¿Ú
>>>>>>> å»ºæä¹‹å®¶
 * @author 12753
 *
 */
@Service
public interface ProductCategoryService {
<<<<<<< HEAD

	/**
	 * æ·»åŠ å»ºæåˆ†ç±»
=======
	
	/**
	 * Ìí¼Ó½¨²Ä·ÖÀà
>>>>>>> å»ºæä¹‹å®¶
	 * @param productCategory
	 * @return
	 */
	public int add(ProductCategory productCategory);
	
	/**
<<<<<<< HEAD
	 * ç¼–è¾‘å»ºæåˆ†ç±»
=======
	 * ±à¼­½¨²Ä·ÖÀà
>>>>>>> å»ºæä¹‹å®¶
	 * @param productCategory
	 * @return
	 */
	public int edit(ProductCategory productCategory);
	
	/**
<<<<<<< HEAD
	 * åˆ é™¤å»ºæåˆ†ç±»
	 * @param productCategory
=======
	 * É¾³ı½¨²Ä·ÖÀà
	 * @param id
>>>>>>> å»ºæä¹‹å®¶
	 * @return
	 */
	public int delete(Long id);
	
	/**
<<<<<<< HEAD
	 * å¤šæ¡ä»¶æœç´¢æŸ¥è¯¢å»ºæåˆ†ç±»
	 * @param productCategory
	 * @return
	 */
	public List<ProductCategory> findList(Map<String,Object> queMap);
=======
	 * ¶àÌõ¼şËÑË÷´Ê²éÑ¯½¨²Ä·ÖÀà
	 * @param queMap
	 * @return
	 */
	public List<ProductCategory> findList(Map<String, Object> queryMap);
	
	/**
	 * »ñÈ¡·ûºÏÌõ¼şµÄ×Ü¼ÇÂ¼Êı
	 * @param queryMap
	 * @return
	 */
	public Integer getTotal(Map<String, Object> queryMap);
	
	/**
	 * ¸ù¾İid²éÑ¯½¨²Ä·ÖÀà
	 * @param id
	 * @return
	 */
	public ProductCategory findById(Long id);
>>>>>>> å»ºæä¹‹å®¶
}
