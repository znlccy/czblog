package com.znlccy.blog.index.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * ClassName: IndexFilter
 * FileName：IndexFilter.java
 * Description：前台过滤器
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/5/10			    create
 */
@Slf4j
@WebFilter(filterName = "indexFilter", urlPatterns = "/*")
public class IndexFilter implements Filter {

    /**
     * 初始化过滤器
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("-----------前台过滤器初始化-----------");
    }

    /**
     * 实现过滤
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("-----------前台过滤执行中-----------");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    /**
     * 销毁过滤
     */
    @Override
    public void destroy() {
        log.info("-----------前台销毁过滤器-----------");
    }
}
