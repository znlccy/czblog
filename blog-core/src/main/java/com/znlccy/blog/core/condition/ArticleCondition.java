package com.znlccy.blog.core.condition;

import lombok.Data;

import java.util.Date;

/**
 * The type ArticleCondition 
 *
 * FileName：ArticleCondition.java
 * Description：	文章多条件查询
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/30-19:52			create
 */
@Data
public class ArticleCondition {

    /**
     * 文章标签
     */
    private String tag;

    /**
     * 文章分类
     */
    private String category;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 文章类型
     */
    private String type;

    /**
     * 文章状态
     */
    private String status;

    /**
     * 文章开始时间
     */
    private Date startTime;

    /**
     * 文章结束时间
     */
    private Date endTime;

}
