package com.znlccy.blog.index.controller;

import com.znlccy.blog.core.controller.BaseController;
import com.znlccy.blog.core.service.IArticleService;
import com.znlccy.blog.core.service.ICommentService;
import com.znlccy.blog.core.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * The type HomeConrtoller 
 *
 * FileName：HomeConrtoller.java
 * Description：	首页控制器
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-22:41			create
 */
@Controller
public class HomeConrtoller extends BaseController {

    /**
     * 依赖注入文章服务
     */
    @Autowired
    private IArticleService articleService;

    /**
     * 依赖注入评论服务
     */
    @Autowired
    private ICommentService commentService;

    /**
     * 依赖注入项目服务
     */
    @Autowired
    private IProjectService projectService;

    /**
     * 首页路径
     * @return
     */
    @GetMapping(value = {"/", "/index"})
    public String index(Model model) {
        model.addAttribute("user", "chen");
        return "index";
    }

}
