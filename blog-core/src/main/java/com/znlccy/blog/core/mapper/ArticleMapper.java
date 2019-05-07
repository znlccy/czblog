package com.znlccy.blog.core.mapper;

import com.znlccy.blog.core.condition.ArticleCondition;
import com.znlccy.blog.core.model.Article;
import com.znlccy.blog.core.model.ArticleProject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The type ArticleMapper
 *
 * FileName：ArticleMapper.java
 * Description：	文章Dao层
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-22:47			create
 */
@Mapper
public interface ArticleMapper {

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
    Article findArticleById(@Param("atid") Long atid);

    /**
     * 多条件查找文章
     * @param articleCondition
     * @return
     */
    List<Article> findArticleByCondition(ArticleCondition articleCondition);

    /**
     * 更新文章
     * @param article
     */
    void updateArticle(Article article);

    /**
     * 删除文章
     * @param atid
     */
    void deleteArticleById(@Param("atid") Long atid);

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
    List<Article> findArticleByCategory(@Param("category") String category);

    /**
     * 标签查找文章
     * @param atids
     * @return
     */
    List<Article> findArticleByTag(List<ArticleProject> atids);
}
