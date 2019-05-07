package com.znlccy.blog.core.service.impl;

import com.github.pagehelper.PageInfo;
import com.znlccy.blog.core.mapper.AttachmentMapper;
import com.znlccy.blog.core.model.Attachment;
import com.znlccy.blog.core.service.IAttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * The type AttachmentServiceImpl 
 *
 * FileName：AttachmentServiceImpl.java
 * Description：	附件服务实现类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-21:33			create
 */
@Service
public class AttachmentServiceImpl implements IAttachmentService {

    @Autowired
    private AttachmentMapper attachmentMapper;

    /**
     * 添加附件
     * @param attachment
     */
    @Transactional
    @CacheEvict(value = {"attachmentCache", "attachmentCaches"}, allEntries = true, beforeInvocation = true)
    @Override
    public void saveAttachment(Attachment attachment) {

    }

    /**
     * 多条件查找附件
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Cacheable(value = "attachmentCaches")
    @Override
    public PageInfo<Attachment> findAttachmentByCondition(int pageNum, int pageSize) {
        return null;
    }

    /**
     * 查找附件
     * @param amid
     * @return
     */
    @Cacheable(value = "attachmentCache", key = "'attachmentById_' + #p0")
    @Override
    public Attachment findAttachmentById(Long amid) {
        return null;
    }

    /**
     * 更新附件
     * @param attachment
     */
    @Transactional
    @CacheEvict(value = {"attachmentCache", "attachmentCaches"}, allEntries = true, beforeInvocation = true)
    @Override
    public void updateAttachment(Attachment attachment) {

    }

    /**
     * 删除附件
     * @param amid
     */
    @Transactional
    @CacheEvict(value = {"attachmentCache", "attachmentCaches"}, allEntries = true, beforeInvocation = true)
    @Override
    public void deleteAttachmentById(Long amid) {

    }

    /**
     * 附件总数
     * @return
     */
    @Cacheable(value = "attachmentCache", key = "attachment_count")
    @Override
    public Long getAttachmentCount() {
        return null;
    }
}
