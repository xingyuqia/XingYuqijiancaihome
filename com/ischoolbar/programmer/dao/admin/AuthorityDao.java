package com.ischoolbar.programmer.dao.admin;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ischoolbar.programmer.entity.admin.Authority;

/**
<<<<<<< HEAD
 * 权限实现类dao
 * @author llq
=======
 * Ȩ��ʵ����dao
 * @author 12753
>>>>>>> 建材之家
 *
 */
@Repository
public interface AuthorityDao {
	public int add(Authority authority);
	public int deleteByRoleId(Long roleId);
	public List<Authority> findListByRoleId(Long roleId);
}
