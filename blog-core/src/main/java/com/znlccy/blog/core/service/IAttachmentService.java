package com.znlccy.blog.core.service;

import com.github.pagehelper.PageInfo;
import com.znlccy.blog.core.model.Attachment;

/**
 * The type IAttachmentService
 *
 * FileName：IAttachmentService.java
 * Description：	附件服务接口类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-21:14			create
 */
public interface IAttachmentService {

    /**
     * 添加附件
     * @param attachment
     */
    void saveAttachment(Attachment attachment);

    /**
     * 分页查找附件
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<Attachment> findAttachmentByCondition(int pageNum, int pageSize);

    /**
     * 查找附件
     * @param amid
     * @return
     */
    Attachment findAttachmentById(Long amid);

    /**
     * 更新附件
     * @param attachment
     */
    void updateAttachment(Attachment attachment);

    /**
     * 删除附件
     * @param amid
     */
    void deleteAttachmentById(Long amid);

    /**
     * 附件总数
     * @return
     */
    Long getAttachmentCount();
}
