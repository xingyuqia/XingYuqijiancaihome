package com.ischoolbar.programmer.page.admin;

import org.springframework.stereotype.Component;

/**
<<<<<<< HEAD
 * 分页基本信息
 * @author llq
=======
 * ��ҳ������Ϣ
 * @author 12753
>>>>>>> 建材之家
 *
 */
@Component
public class Page {
<<<<<<< HEAD
	private int page = 1;//当前页码
	
	private int rows;//每页显示数量
	
	private int offset;//对应数据库中的偏移量
=======
	private int page = 1;//��ǰҳ��
	
	private int rows;//ÿҳ��ʾ����
	
	private int offset;//��Ӧ���ݿ��е�ƫ����
>>>>>>> 建材之家

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getOffset() {
		this.offset = (page - 1) * rows;
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}
	
	
}
