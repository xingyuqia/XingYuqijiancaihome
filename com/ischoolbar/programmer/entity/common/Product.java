package com.ischoolbar.programmer.entity.common;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * ����ʵ��
 * @author 12753
 *
 */
@Component
public class Product {
	
	private Long id;//����id
	
	private Long productCategoryId;//����id
	
	private String name;//��������
	
	private String tags;//�����ǩ���������ս��ķ�������
	
	private String imageUrl;//������ͼ
	
	private Double price;//���ļ۸�
	
	private int stock;//���Ŀ��
	
	private int sellNum;//����
	
	private int viewNum;//�����
	
	private int commentNum;//������
	
	private String content;//������������
	
	private Date createTime;//���ʱ��

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
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

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getSellNum() {
		return sellNum;
	}

	public void setSellNum(int sellNum) {
		this.sellNum = sellNum;
	}

	public int getViewNum() {
		return viewNum;
	}

	public void setViewNum(int viewNum) {
		this.viewNum = viewNum;
	}

	public int getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
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
