package com.znlccy.blog.core.service.impl;

import com.github.pagehelper.PageInfo;
import com.znlccy.blog.core.condition.CommentCondition;
import com.znlccy.blog.core.constant.ErrorConstant;
import com.znlccy.blog.core.exception.BusinessException;
import com.znlccy.blog.core.mapper.CommentMapper;
import com.znlccy.blog.core.model.Comment;
import com.znlccy.blog.core.service.ICommentService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * The type CommentServiceImpl 
 *
 * FileName：CommentServiceImpl.java
 * Description：	评论服务实现类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-21:34			create
 */
@Service
public class CommentServiceImpl implements ICommentService {

    /**
     * 依赖注入评论Mapper
     */
    @Autowired
    private CommentMapper commentMapper;

    /**
     * 添加评论
     * @param comment
     */
    @Transactional
    @CacheEvict(value = {"commentCache", "commentCaches"}, allEntries = true, beforeInvocation = true)
    @Override
    public void saveComment(Comment comment) {

        //提示信息
        String msg = null;
        if (null == comment) {
            msg = "评论对象为空";
        }
        if (StringUtils.isBlank(comment.getAuthor())) {
            comment.setAuthor("热心网友");
        }
        if (StringUtils.isNotBlank(comment.getEmail())) {

        }
        commentMapper.saveComment(comment);
    }

    /**
     * 更新评论
     * @param comment
     */
    @Transactional
    @CacheEvict(value = {"commmentCache", "commentCaches"}, allEntries = true, beforeInvocation = true)
    @Override
    public void updateComment(Comment comment) {

    }

    /**
     * 查找评论
     * @param atid
     * @return
     */
    @Cacheable(value = "commentCaches",  key = "#p0")
    @Override
    public List<Comment> findCommentByArticleId(Long atid) {
        return null;
    }

    /**
     * 查找评论
     * @param cmid
     * @return
     */
    @Cacheable(value = "commentCache", key = "'commentById_' + #p0")
    @Override
    public Comment findCommentById(Long cmid) {
        return null;
    }

    /**
     * 评论分页
     * @param commentCondition
     * @return
     */
    @Override
    public PageInfo<Comment> findCommentByCondition(CommentCondition commentCondition) {
        return null;
    }

    /**
     * 删除评论
     * @param cmid
     */
    @Override
    public void deleteCommentById(Long cmid) {

    }

    /**
     * 评论总数
     * @return
     */
    @Override
    public Long getCommentCount() {
        return null;
    }

    /**
     * 更新评论状态
     * @param cmid
     * @param status
     */
    @Override
    public void updateCommentStatus(Long cmid, String status) {

    }
}
