package com.ischoolbar.programmer.util;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.List;

import com.ischoolbar.programmer.entity.admin.Menu;

/**
 * å…³äºèœå•æ“ä½œçš„ä¸€äº›å…¬ç”¨æ–¹æ³•
 * @author llq
=======
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ischoolbar.programmer.entity.admin.Menu;
import com.ischoolbar.programmer.entity.common.ProductCategory;

/**
 * ¹ØÓÚ²Ëµ¥²Ù×÷µÄÒ»Ğ©¹«ÓÃ·½·¨
 * @author 12753
>>>>>>> å»ºæä¹‹å®¶
 *
 */
public class MenuUtil {
	/**
<<<<<<< HEAD
	 * ä»ç»™å®šçš„èœå•ä¸­è¿”å›æ‰€æœ‰é¡¶çº§èœå•
=======
	 * ´Ó¸ø¶¨µÄ²Ëµ¥ÖĞ·µ»ØËùÓĞ¶¥¼¶²Ëµ¥
>>>>>>> å»ºæä¹‹å®¶
	 * @param menuList
	 * @return
	 */
	public static List<Menu> getAllTopMenu(List<Menu> menuList){
		List<Menu> ret = new ArrayList<Menu>();
		for(Menu menu:menuList){
			if(menu.getParentId() == 0){
				ret.add(menu);
			}
		}
		return ret;
	}
	
	/**
<<<<<<< HEAD
	 * è·å–æ‰€æœ‰çš„äºŒçº§èœå•
=======
	 * »ñÈ¡ËùÓĞµÄ¶ş¼¶²Ëµ¥
>>>>>>> å»ºæä¹‹å®¶
	 * @param menuList
	 * @return
	 */
	public static List<Menu> getAllSecondMenu(List<Menu> menuList){
		List<Menu> ret = new ArrayList<Menu>();
		List<Menu> allTopMenu = getAllTopMenu(menuList);
		for(Menu menu:menuList){
			for(Menu topMenu:allTopMenu){
				if(menu.getParentId() == topMenu.getId()){
					ret.add(menu);
					break;
				}
			}
		}
		return ret;
	}
	
	/**
<<<<<<< HEAD
	 * è·å–æŸä¸ªäºŒçº§èœå•ä¸‹çš„æŒ‰é’®
=======
	 * »ñÈ¡Ä³¸ö¶ş¼¶²Ëµ¥ÏÂµÄ°´Å¥
>>>>>>> å»ºæä¹‹å®¶
	 * @param menuList
	 * @param url
	 * @return
	 */
	public static List<Menu> getAllThirdMenu(List<Menu> menuList,Long secondMenuId){
		List<Menu> ret = new ArrayList<Menu>();
		for(Menu menu:menuList){
			if(menu.getParentId() == secondMenuId){
				ret.add(menu);
			}
		}
		return ret;
	}
<<<<<<< HEAD
=======
	
	/**
	 * ¸ù¾İÁĞ±íÉú³ÉÈı¼¶Ê÷ĞÎ¹ØÏµ·ÖÀà
	 * @param productCategorieList
	 * @return
	 */
	public static List<Map<String, Object>> getTreeCategory(List<ProductCategory> productCategorieList){
		List<Map<String, Object>> ret = new ArrayList<Map<String,Object>>();
		//ËùÓĞµÄ¸¸·ÖÀàÕûÀí
		for(ProductCategory productCategory : productCategorieList){
			if(productCategory.getParentId() == null){
				Map<String, Object> top = new HashMap<String, Object>();
				top.put("id", productCategory.getId());
				top.put("text", productCategory.getName());
				top.put("children", new ArrayList<Map<String,Object>>());
				ret.add(top);
			}
		}
		//Ìí¼Ó¶ş¼¶
		for(ProductCategory productCategory : productCategorieList){
			if(productCategory.getParentId() != null){
				for(Map<String, Object> map : ret){
					if(productCategory.getParentId().longValue() == Long.valueOf(map.get("id")+"")){
						List children = (List)map.get("children");
						Map<String, Object> child = new HashMap<String, Object>();
						child.put("id", productCategory.getId());
						child.put("text", productCategory.getName());
						child.put("children", new ArrayList<Map<String,Object>>());
						children.add(child);
					}
				}
			}
		}
		//Ìí¼ÓÈı¼¶
		for(ProductCategory productCategory : productCategorieList){
			if(productCategory.getParentId() != null){
				for(Map<String, Object> map : ret){
					//»ñÈ¡¶ş¼¶·ÖÀà
					List<Map<String, Object>> children = (List<Map<String, Object>>)map.get("children");
					for(Map<String, Object> child : children){
						if(productCategory.getParentId().longValue() == Long.valueOf(child.get("id")+"")){
							List grandsons = (List)child.get("children");
							Map<String, Object> grandson = new HashMap<String, Object>();
							grandson.put("id", productCategory.getId());
							grandson.put("text", productCategory.getName());
							grandsons.add(grandson);
						}
					}
					
				}
			}
		}
		return ret;
	}
>>>>>>> å»ºæä¹‹å®¶
}
