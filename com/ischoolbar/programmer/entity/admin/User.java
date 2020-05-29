package com.ischoolbar.programmer.entity.admin;

import org.springframework.stereotype.Component;

/**
<<<<<<< HEAD
 * ç”¨æˆ·å®ä½“ç±»
 * @author llq
=======
 * ÓÃ»§ÊµÌåÀà
 * @author 12753
>>>>>>> å»ºæä¹‹å®¶
 *
 */
@Component
public class User {
<<<<<<< HEAD
	private Long id;//ç”¨æˆ·idï¼Œè®¾ç½®è‡ªå¢
	private String username;//ç”¨æˆ·åï¼Œç™»å½•å
	private String password;//ç™»å½•å¯†ç 
	private Long roleId;//æ‰€å±è§’è‰²id
	private String photo;//å¤´åƒç…§ç‰‡åœ°å€
	private int sex;//æ€§åˆ«0,ä»£è¡¨æœªçŸ¥ï¼Œ1ä»£è¡¨ç”·ï¼Œ2ä»£è¡¨å¥³
	private Integer age;//å¹´é¾„
	private String address;//å®¶åº­ä½å€
=======
	private Long id;//ÓÃ»§id£¬ÉèÖÃ×ÔÔö
	private String username;//ÓÃ»§Ãû£¬µÇÂ¼Ãû
	private String password;//µÇÂ¼ÃÜÂë
	private Long roleId;//ËùÊô½ÇÉ«id
	private String photo;//Í·ÏñÕÕÆ¬µØÖ·
	private int sex;//ĞÔ±ğ0,´ú±íÎ´Öª£¬1´ú±íÄĞ£¬2´ú±íÅ®
	private Integer age;//ÄêÁä
	private String address;//¼ÒÍ¥×¡Ö·
>>>>>>> å»ºæä¹‹å®¶
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
