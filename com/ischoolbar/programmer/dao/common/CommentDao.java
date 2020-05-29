package com.ischoolbar.programmer.dao.common;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ischoolbar.programmer.entity.common.Comment;

/**
 * 建材dao层
 * @author 12753
 *
 */
@Repository
public interface CommentDao {
	/**
	 * 添加评论
	 * @param comment
	 * @return
	 */
	public int add(Comment comment);
	
	/**
	 * 编辑评论
	 * @param comment
	 * @return
	 */
	public int edit(Comment comment);
	
	/**
	 * 删除评论
	 * @param id
	 * @return
	 */
	public int delete(Long id);
	
	/**
	 * 多条件搜索词查询评论
	 * @param queMap
	 * @return
	 */
	public List<Comment> findList(Map<String, Object> queryMap);
	
	/**
	 * 获取符合条件的总记录数
	 * @param queryMap
	 * @return
	 */
	public Integer getTotal(Map<String, Object> queryMap);
	
	/**
	 * 根据id查询评论
	 * @param id
	 * @return
	 */
	public Comment findById(Long id);
}
