package com.znlccy.blog.core.condition;

import java.util.Date;

/**
 * The type AttachmentCondition
 *
 * FileName：AttachmentCondition.java
 * Description：	附件多条件查找
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/31-23:00			create
 */
public class AttachmentCondition {

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 文件类型
     */
    private String fileType;

    /**
     * 文件路径
     */
    private String filePath;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;
}
