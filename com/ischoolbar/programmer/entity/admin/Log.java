package com.ischoolbar.programmer.entity.admin;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
<<<<<<< HEAD
 * 系统日志
 * @author llq
=======
 * ϵͳ��־
 * @author 12753
>>>>>>> 建材之家
 *
 */
@Component
public class Log {
	private Long id;
	
<<<<<<< HEAD
	private String content;//日志内容
	
	private Date createTime;//创建时间
=======
	private String content;//��־����
	
	private Date createTime;//����ʱ��
>>>>>>> 建材之家

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
