package com.znlccy.blog.core.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * The type Comment
 *
 * FileName：Comment.java
 * Description：	评论实体类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-21:31			create
 */
@Data
@NoArgsConstructor
@ToString
public class Comment extends BaseModel {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = -1870046913821753711L;

    /**
     * 评论主键
     */
    private Long cmid;

    /**
     * 文章主键
     */
    private Long atid;

    /**
     * 评论作者
     */
    private String author;

    /**
     * 作者主键
     */
    private Long authorId;

    /**
     * 评论拥有者
     */
    private Long ownerId;

    /**
     * 评论者邮件
     */
    private String email;

    /**
     * 评论者网址
     */
    private String url;

    /**
     * 评论者ip地址
     */
    private String ip;

    /**
     * 评论者客户端
     */
    private String agent;

    /**
     * 评论类型
     */
    private String type;

    /**
     * 评论状态
     */
    private Integer status;

    /**
     * 父级评论
     */
    private Integer parent;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
