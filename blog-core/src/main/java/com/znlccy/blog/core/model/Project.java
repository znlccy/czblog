package com.znlccy.blog.core.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * The type Project 
 *
 * FileName：Project.java
 * Description：	项目实体类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-22:33			create
 */
@Data
@NoArgsConstructor
@ToString
public class Project extends BaseModel {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = -6280399584985558979L;

    /**
     * 项目主键
     */
    private Long pjid;

    /**
     * 项目名称
     */
    private String name;

    /**
     * 项目缩略名
     */
    private String slug;

    /**
     * 项目类型
     */
    private String type;

    /**
     * 文章类型
     */
    private String contentType;

    /**
     * 项目描述
     */
    private String description;

    /**
     * 项目排序
     */
    private Integer sort;

    /**
     * 项目父节点
     */
    private Integer parent;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
