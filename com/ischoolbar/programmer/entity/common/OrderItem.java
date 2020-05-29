package com.ischoolbar.programmer.entity.common;

import org.springframework.stereotype.Component;

/**
 * ��������ʵ��
 * @author 12753
 *
 */
@Component
public class OrderItem {
	
	private Long id;//���ķ���id
	
	private Long orderId;//��������id
	
	private Long productId;//��������id
	
	private String name;//��������
	
	private String imageUrl;//������ͼ
	
	private Double price;//���ļ۸�
	
	private int num;//��������
	
	private Double money;//���Ľ��
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	

	
	
	
	
}
