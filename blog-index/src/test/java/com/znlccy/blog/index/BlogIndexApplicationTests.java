package com.znlccy.blog.index;

import com.znlccy.blog.core.model.Article;
import com.znlccy.blog.core.service.IArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogIndexApplicationTests {

    @Autowired
    private IArticleService articleService;

    @Test
    public void contextLoads() {
    }

    /**
     * 添加文章
     */
    @Test
    public void saveArticle() {
        Article article = new Article();
        article.setAuthorId(23232L);
        article.setAllowComment(80);
        article.setAllowFeed(3);
        article.setAllowPing(8);
        article.setCategory("Java");
        article.setType("JAVA");
        article.setCommentNum(10);
        article.setContent("Java技术社区");
        article.setTitle("JAVA架构师");
        article.setCreateTime(new Date());

        articleService.saveArticle(article);
    }

    /**
     * 获取文章
     */
    @Test
    public void findArticleById() {
        Article article = articleService.findArticleById(1L);
        System.out.println("文章" + article);
    }

    @Test
    public void updateArticle() {
        Article article = articleService.findArticleById(2L);
        article.setUpdateTime(new Date());
        articleService.updateArticle(article);
    }
}
