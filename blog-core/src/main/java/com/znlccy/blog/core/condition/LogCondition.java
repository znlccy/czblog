package com.znlccy.blog.core.condition;

import lombok.Data;

import java.util.Date;

/**
 * The type LogCondition 
 *
 * FileName：LogCondition.java
 * Description：	日志多条件查询
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/30-20:31			create
 */
@Data
public class LogCondition {

    /**
     * 日志行为
     */
    private String action;

    /**
     * 日志数据
     */
    private String data;

    /**
     * 作者主键
     */
    private Long authorId;

    /**
     * 日志来源
     */
    private String ip;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

}
