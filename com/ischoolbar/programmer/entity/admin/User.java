package com.ischoolbar.programmer.entity.admin;

import org.springframework.stereotype.Component;

/**
<<<<<<< HEAD
 * 用户实体类
 * @author llq
=======
 * �û�ʵ����
 * @author 12753
>>>>>>> 建材之家
 *
 */
@Component
public class User {
<<<<<<< HEAD
	private Long id;//用户id，设置自增
	private String username;//用户名，登录名
	private String password;//登录密码
	private Long roleId;//所属角色id
	private String photo;//头像照片地址
	private int sex;//性别0,代表未知，1代表男，2代表女
	private Integer age;//年龄
	private String address;//家庭住址
=======
	private Long id;//�û�id����������
	private String username;//�û�������¼��
	private String password;//��¼����
	private Long roleId;//������ɫid
	private String photo;//ͷ����Ƭ��ַ
	private int sex;//�Ա�0,����δ֪��1�����У�2����Ů
	private Integer age;//����
	private String address;//��ͥסַ
>>>>>>> 建材之家
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
}
