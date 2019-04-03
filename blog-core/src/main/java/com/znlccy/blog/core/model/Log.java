package com.znlccy.blog.core.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * The type Log 
 *
 * FileName：Log.java
 * Description：	
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-22:30			create
 */
@Data
@NoArgsConstructor
@ToString
public class Log extends BaseModel {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = 8159573307272028305L;

    /**
     * 日志主键
     */
    private Long lid;

    /**
     * 产生动作
     */
    private String action;

    /**
     * 产生数据
     */
    private String data;

    /**
     * 作者主键
     */
    private Long authorId;

    /**
     * 日志IP
     */
    private String ip;

    /**
     * 创建时间
     */
    private Date createTime;
}
