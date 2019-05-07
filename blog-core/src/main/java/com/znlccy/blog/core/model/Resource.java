package com.znlccy.blog.core.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * The type Resource
 *
 * FileName：Resource.java
 * Description：	资源实体类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/29-10:49			create
 */
@Data
@NoArgsConstructor
@ToString
public class Resource extends BaseModel {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = 2178255010455077701L;

    /**
     * 资源主键
     */
    private Long rsid;

    /**
     * 资源名称
     */
    private String name;

    /**
     * 资源描述
     */
    private String description;

    /**
     * 资源父节点
     */
    private Long parent;

    /**
     * 资源类型
     */
    private String type;

    /**
     * 资源排序
     */
    private Integer sort;

    /**
     * 资源路径
     */
    private String url;

    /**
     * 资源状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
