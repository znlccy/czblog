package com.znlccy.blog.core.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * The type Attachment
 *
 * FileName：Attachment.java
 * Description：	附件实体类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-21:13			create
 */
@Data
@NoArgsConstructor
@ToString
public class Attachment extends BaseModel {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = 243465836339440162L;

    /**
     * 附件主键
     */
    private Long amid;

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
     * 上传作者
     */
    private Long authorId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
