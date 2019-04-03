package com.znlccy.blog.core.service;

import com.github.pagehelper.PageInfo;
import com.znlccy.blog.core.condition.CommentCondition;
import com.znlccy.blog.core.model.Comment;

import java.util.List;

/**
 * The type ICommentService 
 *
 * FileName：ICommentService.java
 * Description：	评论服务接口类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-21:32			create
 */
public interface ICommentService {

    /**
     * 添加评论
     * @param comment
     */
    void saveComment(Comment comment);

    /**
     * 更新评论
     * @param comment
     */
    void updateComment(Comment comment);

    /**
     * 通过文章主键查找评论
     * @param atid
     * @return
     */
    List<Comment> findCommentByArticleId(Long atid);

    /**
     * 查找评论
     * @param cmid
     * @return
     */
    Comment findCommentById(Long cmid);

    /**
     * 多条件查找评论
     * @param commentCondition
     * @return
     */
    PageInfo<Comment> findCommentByCondition(CommentCondition commentCondition);

    /**
     * 删除评论
     * @param cmid
     */
    void deleteCommentById(Long cmid);

    /**
     * 评论总数
     * @return
     */
    Long getCommentCount();

    /**
     * 更新评论状态
     * @param cmid
     * @param status
     */
    void updateCommentStatus(Long cmid, String status);

}
