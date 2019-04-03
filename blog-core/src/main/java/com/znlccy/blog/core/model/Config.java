package com.znlccy.blog.core.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * The type Config 
 *
 * FileName：Config.java
 * Description：	网站配置实体类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/29-20:51			create
 */
@Data
@NoArgsConstructor
@ToString
public class Config extends BaseModel {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = -4723830276686841106L;

    /**
     * 配置主键
     */
    private Long cfid;

    /**
     * 配置名称
     */
    private String name;

    /**
     * 配置阈值
     */
    private String value;

    /**
     * 配置描述
     */
    private String description;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
