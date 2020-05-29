package com.ischoolbar.programmer.entity.admin;

import org.springframework.stereotype.Component;

/**
<<<<<<< HEAD
 * 角色role实体
 * @author llq
=======
 * ��ɫroleʵ��
 * @author 12753
>>>>>>> 建材之家
 *
 */
@Component
public class Role {
	
	private Long id;
	
	private String name;
	
<<<<<<< HEAD
	private String remark;//角色备注
=======
	private String remark;//��ɫ��ע
>>>>>>> 建材之家

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
