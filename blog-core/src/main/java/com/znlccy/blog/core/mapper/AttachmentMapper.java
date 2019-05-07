package com.znlccy.blog.core.mapper;

import com.znlccy.blog.core.condition.AttachmentCondition;
import com.znlccy.blog.core.model.Attachment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    /**
     * 添加附件
     * @param attachment
     */
    void saveAttachment(Attachment attachment);

    /**
     * 查找附件
     * @param amid
     * @return
     */
    Attachment findAttachmentById(@Param("amid") Long amid);

    /**
     * 多条件查找附件
     * @param attachmentCondition
     * @return
     */
    List<Attachment> findAttachmentByCondition(AttachmentCondition attachmentCondition);

    /**
     * 更新附件
     * @param attachment
     */
    void updateAttachment(Attachment attachment);

    /**
     * 删除附件
     * @param amid
     */
    void deleteAttachmentById(@Param("amid") Long amid);

    /**
     * 附件总数
     * @return
     */
    Long getAttachmentCount();
}
