package com.znlccy.blog.admin.controller;

import com.znlccy.blog.core.controller.BaseController;
import com.znlccy.blog.core.model.Article;
import com.znlccy.blog.core.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: ArticleController
 * FileName：ArticleController.java
 * Description：文章控制器
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/4/25			    create
 */
@Controller
@RequestMapping(value = "/article")
public class ArticleController extends BaseController {

    @Autowired
    private IArticleService articleService;

    @ResponseBody
    @GetMapping(value = "/detail/{atid}")
    public Article getArticleDetail(@PathVariable Long atid) {
        return articleService.findArticleById(atid);
    }
}
