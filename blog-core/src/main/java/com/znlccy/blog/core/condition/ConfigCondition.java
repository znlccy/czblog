package com.znlccy.blog.core.condition;

import lombok.Data;

import java.util.Date;

/**
 * The type ConfigCondition
 *
 * FileName：ConfigCondition.java
 * Description：	配置多条件查询
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/30-20:13			create
 */
@Data
public class ConfigCondition {

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
     * 配置开始时间
     */
    private Date startTime;

    /**
     * 配置结束时间
     */
    private Date endTime;
}
