package com.znlccy.blog.core.condition;

import lombok.Data;

import java.util.Date;

/**
 * The type ProjectCondition
 *
 * FileName：ProjectCondition.java
 * Description：	项目多条件查询
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/30-20:22			create
 */
@Data
public class ProjectCondition {

    /**
     * 项目名称
     */
    private String name;

    /**
     * 项目类型
     */
    private String type;

    /**
     * 项目开始时间
     */
    private Date startTime;

    /**
     * 项目结束时间
     */
    private Date endTime;
}
