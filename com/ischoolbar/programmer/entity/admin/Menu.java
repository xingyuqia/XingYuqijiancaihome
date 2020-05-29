package com.ischoolbar.programmer.entity.admin;

import org.springframework.stereotype.Component;

/**
<<<<<<< HEAD
 * èœå•å®ä½“ç±»
 * @author llq
=======
 * ²Ëµ¥ÊµÌåÀà
 * @author 12753
>>>>>>> å»ºæä¹‹å®¶
 *
 */
@Component
public class Menu {
	private Long id;
<<<<<<< HEAD
	private Long parentId;//çˆ¶ç±»id
	private Long _parentId;//çˆ¶ç±»id,ç”¨æ¥åŒ¹é…easyuiçš„çˆ¶ç±»id
	private String name;//èœå•åç§°
	private String url;//ç‚¹å‡»åçš„url
	private String icon;//èœå•iconå›¾è¡¨
=======
	private Long parentId;//¸¸Ààid
	private Long _parentId;//¸¸Ààid,ÓÃÀ´Æ¥ÅäeasyuiµÄ¸¸Ààid
	private String name;//²Ëµ¥Ãû³Æ
	private String url;//µã»÷ºóµÄurl
	private String icon;//²Ëµ¥iconÍ¼±í
>>>>>>> å»ºæä¹‹å®¶
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public Long get_parentId() {
		_parentId = parentId;
		return _parentId;
	}
	public void set_parentId(Long _parentId) {
		this._parentId = _parentId;
	}
}
