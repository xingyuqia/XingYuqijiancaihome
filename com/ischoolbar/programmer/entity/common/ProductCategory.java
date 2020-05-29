package com.ischoolbar.programmer.entity.common;

import org.springframework.stereotype.Component;

/**
<<<<<<< HEAD
 * 寤烘潗鍒嗙被瀹炰綋
=======
 * 建材分类实体
>>>>>>> 寤烘潗涔嬪
 * @author 12753
 *
 */
@Component
public class ProductCategory {
	
<<<<<<< HEAD
	private Long id;//寤烘潗鍒嗙被id
	
	private Long parentId;//鍒嗙被鐖秈d
	
	private String name;//鍟嗗搧鍒嗙被鍚嶇О
	
	private String tags;//鍒嗙被鏍囩锛岀敤鏉ユ爣璁拌瘑鍒垎绫荤殑灞傜骇鍏崇郴
	
	private String remark;//鍟嗗搧澶囨敞
=======
	private Long id;//建材分类id
	
	private Long parentId;//分类父id
	
	private Long _parentId;//父类id,用来匹配easyui的父类id
	
	private String name;//建材分类名称
	
	private String tags;//分类标签，用来标记识别分类的层级关系
	
	private String remark;//建材分类备注
>>>>>>> 寤烘潗涔嬪

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
>>>>>>> 寤烘潗涔嬪
	
	
	
}
<<<<<<< HEAD
 
=======
>>>>>>> 寤烘潗涔嬪
