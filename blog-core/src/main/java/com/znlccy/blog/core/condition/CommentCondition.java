package com.znlccy.blog.core.condition;

import lombok.Data;

import java.util.Date;

/**
 * The type CommentCondition
 *
 * FileName：CommentCondition.java
 * Description：	评论多条件查询
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/30-20:09			create
 */
@Data
public class CommentCondition {

    /**
     * 评论状态
     */
    private String status;

    /**
     * 评论开始时间
     */
    private Date startTime;

    /**
     * 评论结束时间
     */
    private Date endTime;

    /**
     * 评论父节点
     */
    private Long parent;
}
