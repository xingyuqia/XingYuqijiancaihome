package com.ischoolbar.programmer.entity.admin;

import org.springframework.stereotype.Component;

/**
<<<<<<< HEAD
 * 权限实体
 * @author llq
=======
 * Ȩ��ʵ��
 * @author 12753
>>>>>>> 建材之家
 *
 */
@Component
public class Authority {
	private Long id;
	
<<<<<<< HEAD
	private Long roleId;//角色id
	
	private Long menuId;//菜单id
=======
	private Long roleId;//��ɫid
	
	private Long menuId;//�˵�id
>>>>>>> 建材之家

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	
	
}
