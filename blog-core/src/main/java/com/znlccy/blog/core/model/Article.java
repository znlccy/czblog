package com.znlccy.blog.core.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * The type Article
 *
 * FileName：Article.java
 * Description：	文章实体类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-21:36			create
 */
@Data
@NoArgsConstructor
@ToString
public class Article extends BaseModel {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = 8009431270832359076L;

    /**
     * 文章主键
     */
    private Long atid;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 标题图片
     */
    private String titlePic;

    /**
     * 内容缩略名
     */
    private String slug;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 文章作者
     */
    private Long authorId;

    /**
     * 文章类型
     */
    private String type;

    /**
     * 文章状态
     */
    private Integer status;

    /**
     * 标签列表
     */
    private String tag;

    /**
     * 分类列表
     */
    private String category;

    /**
     * 点击次数
     */
    private Integer hit;

    /**
     * 评论数量
     */
    private Integer commentNum;

    /**
     * 是否允许评论
     */
    private Integer allowComment;

    /**
     * 是否允许Ping
     */
    private Integer allowPing;

    /**
     * 允许出现在聚合中
     */
    private Integer allowFeed;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
