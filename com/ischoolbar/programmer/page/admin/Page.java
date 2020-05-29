package com.ischoolbar.programmer.page.admin;

import org.springframework.stereotype.Component;

/**
<<<<<<< HEAD
 * 鍒嗛〉鍩烘湰淇℃伅
 * @author llq
=======
 * 分页基本信息
 * @author 12753
>>>>>>> 寤烘潗涔嬪
 *
 */
@Component
public class Page {
<<<<<<< HEAD
	private int page = 1;//褰撳墠椤电爜
	
	private int rows;//姣忛〉鏄剧ず鏁伴噺
	
	private int offset;//瀵瑰簲鏁版嵁搴撲腑鐨勫亸绉婚噺
=======
	private int page = 1;//当前页码
	
	private int rows;//每页显示数量
	
	private int offset;//对应数据库中的偏移量
>>>>>>> 寤烘潗涔嬪

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
