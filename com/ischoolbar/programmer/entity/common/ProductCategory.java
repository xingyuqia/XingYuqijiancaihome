package com.ischoolbar.programmer.entity.common;

import org.springframework.stereotype.Component;

/**
<<<<<<< HEAD
 * 建材分类实体
=======
 * ���ķ���ʵ��
>>>>>>> 建材之家
 * @author 12753
 *
 */
@Component
public class ProductCategory {
	
<<<<<<< HEAD
	private Long id;//建材分类id
	
	private Long parentId;//分类父id
	
	private String name;//商品分类名称
	
	private String tags;//分类标签，用来标记识别分类的层级关系
	
	private String remark;//商品备注
=======
	private Long id;//���ķ���id
	
	private Long parentId;//���ุid
	
	private Long _parentId;//����id,����ƥ��easyui�ĸ���id
	
	private String name;//���ķ�������
	
	private String tags;//�����ǩ���������ʶ�����Ĳ㼶��ϵ
	
	private String remark;//���ķ��౸ע
>>>>>>> 建材之家

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
<<<<<<< HEAD
=======

	public Long get_parentId() {
		return parentId;
	}

	public void set_parentId(Long _parentId) {
		this._parentId = parentId;
	}
>>>>>>> 建材之家
	
	
	
}
<<<<<<< HEAD
 
=======
>>>>>>> 建材之家
