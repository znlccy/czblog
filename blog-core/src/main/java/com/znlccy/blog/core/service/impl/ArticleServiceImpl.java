package com.znlccy.blog.core.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.znlccy.blog.core.condition.ArticleCondition;
import com.znlccy.blog.core.constant.ErrorConstant;
import com.znlccy.blog.core.constant.SystemConst;
import com.znlccy.blog.core.exception.BusinessException;
import com.znlccy.blog.core.mapper.ArticleMapper;
import com.znlccy.blog.core.model.Article;
import com.znlccy.blog.core.model.ArticleProject;
import com.znlccy.blog.core.service.IArticleService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * The type ArticleServiceImpl
 *
 * FileName：ArticleServiceImpl.java
 * Description：	文章服务实现类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-22:37			create
 */
@Service
public class ArticleServiceImpl implements IArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    /**
     * 添加文章
     * @param article
     */
    @Transactional
    @CacheEvict(value = {"articleCache", "articleCaches"}, allEntries = true, beforeInvocation = true)
    @Override
    public void saveArticle(Article article) {
        if (null == article) {
            throw BusinessException.withErrorCode(ErrorConstant.Common.PARAM_IS_EMPTY);
        }
        if (StringUtils.isBlank(article.getTitle())) {
            throw BusinessException.withErrorCode(ErrorConstant.Article.CONTENT_CAN_NOT_EMPTY);
        }
        if (article.getTitle().length() > SystemConst.MAX_TITLE_COUNT) {
            throw BusinessException.withErrorCode(ErrorConstant.Article.TITLE_IS_TOO_LONG);
        }
        if (StringUtils.isBlank(article.getContent())) {
            throw BusinessException.withErrorCode(ErrorConstant.Article.CONTENT_CAN_NOT_EMPTY);
        }
        if (article.getContent().length() > SystemConst.MAX_CONTENT_COUNT) {
            throw BusinessException.withErrorCode(ErrorConstant.Article.CONTENT_IS_TOO_LONG);
        }

        //取到标签和分类
        String tag = article.getTag();
        String category = article.getCategory();

        //添加文章
        articleMapper.saveArticle(article);
    }

    /**
     * 查找文章
     * @param atid
     * @return
     */
    @Cacheable(value = "articleCache", key = "'articleById_' + #p0")
    @Override
    public Article findArticleById(Long atid) {
        if (null == atid) {
            throw BusinessException.withErrorCode(ErrorConstant.Common.PARAM_IS_EMPTY);
        }
        return articleMapper.findArticleById(atid);
    }

    /**
     * 多条件查找文章
     * @param articleCondition
     * @param pageSize
     * @param pageNum
     * @return
     */
    @Cacheable(value = "articleCaches")
    @Override
    public PageInfo<Article> findArticleByCondition(ArticleCondition articleCondition, int pageSize, int pageNum) {
        if (null == articleCondition) {
            throw BusinessException.withErrorCode(ErrorConstant.Common.PARAM_IS_EMPTY);
        }
        PageHelper.startPage(pageNum, pageSize);
        List<Article> articles = articleMapper.findArticleByCondition(articleCondition);
        PageInfo<Article> pageInfo = new PageInfo<>(articles);
        return pageInfo;
    }

    /**
     * 更新文章
     * @param article
     */
    @Transactional
    @CacheEvict(value = {"articleCache", "articleCaches"}, allEntries = true, beforeInvocation = true)
    @Override
    public void updateArticle(Article article) {

        //标签和分类
        String tag = article.getTag();
        String category = article.getCategory();

        //更新文章
        articleMapper.updateArticle(article);
    }

    /**
     * 删除文章
     * @param atid
     */
    @Transactional
    @CacheEvict(value = {"articleCache", "articleCaches"}, allEntries = true, beforeInvocation = true)
    @Override
    public void deleteArticleById(Long atid) {
        if (null == atid) {
            throw BusinessException.withErrorCode(ErrorConstant.Common.PARAM_IS_EMPTY);
        }
        articleMapper.deleteArticleById(atid);
    }

    /**
     * 文章总数
     * @return
     */
    @Cacheable(value = "articleCache", key = "article_count")
    @Override
    public Long getArticleCount() {
        return articleMapper.getArticleCount();
    }

    /**
     * 分类查找文章
     * @param category
     * @return
     */
    @Override
    public List<Article> findArticleByCategory(String category) {
        return null;
    }

    /**
     * 标签查找文章
     * @param atids
     * @return
     */
    @Override
    public List<Article> findArticleByTag(List<ArticleProject> atids) {
        return null;
    }
}
