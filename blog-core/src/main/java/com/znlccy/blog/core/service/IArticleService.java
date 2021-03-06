package com.znlccy.blog.core.service;

import com.github.pagehelper.PageInfo;
import com.znlccy.blog.core.condition.ArticleCondition;
import com.znlccy.blog.core.model.Article;
import com.znlccy.blog.core.model.ArticleProject;

import java.util.List;

/**
 * The type IArticleService
 *
 * FileName：IArticleService.java
 * Description：	文章服务接口类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-22:33			create
 */
public interface IArticleService {

    /**
     * 保存文章
     * @param article
     */
    void saveArticle(Article article);

    /**
     * 查找文章
     * @param atid
     * @return
     */
    Article findArticleById(Long atid);

    /**
     * 多条件查找文章
     * @param articleCondition
     * @return
     */
    PageInfo<Article> findArticleByCondition(ArticleCondition articleCondition, int pageSize, int pageNum);

    /**
     * 更新文章
     * @param article
     */
    void updateArticle(Article article);

    /**
     * 删除文章
     * @param atid
     */
    void deleteArticleById(Long atid);

    /**
     * 文章总数
     * @return
     */
    Long getArticleCount();

    /**
     * 分类查找文章
     * @param category
     * @return
     */
    List<Article> findArticleByCategory(String category);

    /**
     * 标签查找文章
     * @param atids
     * @return
     */
    List<Article> findArticleByTag(List<ArticleProject> atids);
}
