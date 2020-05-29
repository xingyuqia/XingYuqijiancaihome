package com.ischoolbar.programmer.entity.admin;

import org.springframework.stereotype.Component;

/**
<<<<<<< HEAD
 * 鏉冮檺瀹炰綋
 * @author llq
=======
 * 权限实体
 * @author 12753
>>>>>>> 寤烘潗涔嬪
 *
 */
@Component
public class Authority {
	private Long id;
	
<<<<<<< HEAD
	private Long roleId;//瑙掕壊id
	
	private Long menuId;//鑿滃崟id
=======
	private Long roleId;//角色id
	
	private Long menuId;//菜单id
>>>>>>> 寤烘潗涔嬪

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
