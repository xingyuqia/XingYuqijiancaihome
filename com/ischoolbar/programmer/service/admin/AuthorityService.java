package com.ischoolbar.programmer.service.admin;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ischoolbar.programmer.entity.admin.Authority;

/**
<<<<<<< HEAD
 * 权限service接口
 * @author llq
=======
 * Ȩ��service�ӿ�
 * @author 12753
>>>>>>> 建材之家
 *
 */
@Service
public interface AuthorityService {
	public int add(Authority authority);
	public int deleteByRoleId(Long roleId);
	public List<Authority> findListByRoleId(Long roleId);
}