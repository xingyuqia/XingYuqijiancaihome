package com.ischoolbar.programmer.dao.admin;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ischoolbar.programmer.entity.admin.Authority;

/**
<<<<<<< HEAD
 * 鏉冮檺瀹炵幇绫籨ao
 * @author llq
=======
 * 权限实现类dao
 * @author 12753
>>>>>>> 寤烘潗涔嬪
 *
 */
@Repository
public interface AuthorityDao {
	public int add(Authority authority);
	public int deleteByRoleId(Long roleId);
	public List<Authority> findListByRoleId(Long roleId);
}
