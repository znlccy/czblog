package com.znlccy.blog.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: IndexController
 * FileName：IndexController.java
 * Description：
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/5/9			    create
 */
@Controller
public class IndexController {

    @GetMapping(value = "/")
    public String index() {
        return "index";
    }
}
