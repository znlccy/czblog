package com.znlccy.blog.core.mapper;

import com.znlccy.blog.core.model.Attachment;
import org.apache.ibatis.annotations.Mapper;

/**
 * The type AttachmentMapper
 *
 * FileName：AttachmentMapper.java
 * Description：	附件Dao层
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-21:35			create
 */
@Mapper
public interface AttachmentMapper {

    void addAttachment(Attachment attachment);

    void updateAttachment(Attachment attachment);
}
