package com.znlccy.blog.admin.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * ClassName: AdminListener
 * FileName：AdminListener.java
 * Description：
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/5/10			    create
 */
@WebListener(value = "adminListener")
@Slf4j
public class AdminListener implements ServletContextListener {

    /**
     * 环境上下文初始化
     * @param sce
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("-----------后台监听器上下文初始化-----------");
    }

    /**
     * 环境上下文销毁
     * @param sce
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("-----------后台监听器上下文销毁-----------");
    }
}
