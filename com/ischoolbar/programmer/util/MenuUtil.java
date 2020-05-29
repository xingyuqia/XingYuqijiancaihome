package com.ischoolbar.programmer.util;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.List;

import com.ischoolbar.programmer.entity.admin.Menu;

/**
 * 关于菜单操作的一些公用方法
 * @author llq
=======
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ischoolbar.programmer.entity.admin.Menu;
import com.ischoolbar.programmer.entity.common.ProductCategory;

/**
 * ���ڲ˵�������һЩ���÷���
 * @author 12753
>>>>>>> 建材之家
 *
 */
public class MenuUtil {
	/**
<<<<<<< HEAD
	 * 从给定的菜单中返回所有顶级菜单
=======
	 * �Ӹ����Ĳ˵��з������ж����˵�
>>>>>>> 建材之家
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
	 * 获取所有的二级菜单
=======
	 * ��ȡ���еĶ����˵�
>>>>>>> 建材之家
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
	 * 获取某个二级菜单下的按钮
=======
	 * ��ȡĳ�������˵��µİ�ť
>>>>>>> 建材之家
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
	 * �����б������������ι�ϵ����
	 * @param productCategorieList
	 * @return
	 */
	public static List<Map<String, Object>> getTreeCategory(List<ProductCategory> productCategorieList){
		List<Map<String, Object>> ret = new ArrayList<Map<String,Object>>();
		//���еĸ���������
		for(ProductCategory productCategory : productCategorieList){
			if(productCategory.getParentId() == null){
				Map<String, Object> top = new HashMap<String, Object>();
				top.put("id", productCategory.getId());
				top.put("text", productCategory.getName());
				top.put("children", new ArrayList<Map<String,Object>>());
				ret.add(top);
			}
		}
		//��Ӷ���
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
		//�������
		for(ProductCategory productCategory : productCategorieList){
			if(productCategory.getParentId() != null){
				for(Map<String, Object> map : ret){
					//��ȡ��������
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
>>>>>>> 建材之家
}
