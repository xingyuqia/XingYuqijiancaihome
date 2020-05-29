package com.ischoolbar.programmer.entity.admin;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
<<<<<<< HEAD
 * 绯荤粺鏃ュ織
 * @author llq
=======
 * 系统日志
 * @author 12753
>>>>>>> 寤烘潗涔嬪
 *
 */
@Component
public class Log {
	private Long id;
	
<<<<<<< HEAD
	private String content;//鏃ュ織鍐呭
	
	private Date createTime;//鍒涘缓鏃堕棿
=======
	private String content;//日志内容
	
	private Date createTime;//创建时间
>>>>>>> 寤烘潗涔嬪

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	
	
}
