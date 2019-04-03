package com.znlccy.blog.core.mapper;

import com.znlccy.blog.core.condition.CommentCondition;
import com.znlccy.blog.core.model.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The type CommentMapper
 *
 * FileName：CommentMapper.java
 * Description：	评论Dao层
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-21:35			create
 */
@Mapper
public interface CommentMapper {

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
    List<Comment> findCommentByArticleId(@Param("atid") Long atid);

    /**
     * 查找评论
     * @param cmid
     * @return
     */
    Comment findCommentById(@Param("cmid") Long cmid);

    /**
     * 多条件查找评论
     * @param commentCondition
     * @return
     */
    List<Comment> findCommentByCondition(CommentCondition commentCondition);

    /**
     * 删除评论
     * @param cmid
     */
    void deleteCommentById(@Param("cmid") Long cmid);

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
    void updateCommentStatus(@Param("cmid") Long cmid, @Param("status") String status);
}
