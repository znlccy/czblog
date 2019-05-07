package com.znlccy.blog.core.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.znlccy.blog.core.condition.ResourceCondition;
import com.znlccy.blog.core.mapper.ResourceMapper;
import com.znlccy.blog.core.model.Resource;
import com.znlccy.blog.core.service.IResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * The type ResourceServiceImpl 
 *
 * FileName：ResourceServiceImpl.java
 * Description：	资源服务实现类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/30-22:34			create
 */
@Service
public class ResourceServiceImpl implements IResourceService {

    /**
     * 依赖注入ResourceMapper
     */
    @Autowired
    private ResourceMapper resourceMapper;

    /**
     * 添加资源
     * @param resource
     */
    @Transactional
    @CacheEvict(value = {"resourceCache", "resourceCaches"}, allEntries = true, beforeInvocation = true)
    @Override
    public void saveResource(Resource resource) {
        resourceMapper.saveResource(resource);
    }

    /**
     * 查找资源
     * @param rsid
     * @return
     */
    @Cacheable(value = "resourceCache", key = "'resourceById_' + #p0")
    @Override
    public Resource findResourceById(Long rsid) {
        return resourceMapper.findResourceById(rsid);
    }

    /**
     * 多条件查找资源
     * @param resourceCondition
     * @param pageSize
     * @param pageNum
     * @return
     */
    @Cacheable(value = "resourceCaches")
    @Override
    public PageInfo<Resource> findResourceByCondition(ResourceCondition resourceCondition, int pageSize, int pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        List<Resource> resourceList = resourceMapper.findResourceByCondition(resourceCondition);
        PageInfo<Resource> pageInfo = new PageInfo<>(resourceList);
        return pageInfo;
    }

    /**
     * 更新资源
     * @param resource
     */
    @Transactional
    @CacheEvict(value = {"resourceCache", "resourceCaches"}, allEntries = true, beforeInvocation = true)
    @Override
    public void updateResource(Resource resource) {
        resourceMapper.updateResource(resource);
    }

    /**
     * 删除资源
     * @param rsid
     */
    @Transactional
    @CacheEvict(value = {"resourceCache", "resourceCaches"}, allEntries = true, beforeInvocation = true)
    @Override
    public void deleteResourceById(Long rsid) {
        resourceMapper.deleteResourceById(rsid);
    }

    /**
     * 资源总数
     * @return
     */
    @Cacheable(value = "resourceCache", key = "resource_count")
    @Override
    public Long getResourceCount() {
        return resourceMapper.getResourceCount();
    }
}
