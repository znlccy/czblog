package com.znlccy.blog.admin.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * ClassName: AdminFilter
 * FileName：AdminFilter.java
 * Description：后台过滤器
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/5/10			    create
 */
@WebFilter(filterName = "adminFilter", urlPatterns = "/*")
@Slf4j
public class AdminFilter implements Filter {

    /**
     * 过滤器初始化
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("-----------后台过滤器初始化-----------");
    }

    /**
     * 执行过滤
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("-----------后台过滤器执行中-----------");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    /**
     * 过滤器销毁
     */
    @Override
    public void destroy() {
        log.info("-----------后台过滤器销毁-----------");
    }
}
