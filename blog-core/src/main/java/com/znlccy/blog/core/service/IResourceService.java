package com.znlccy.blog.core.service;

import com.github.pagehelper.PageInfo;
import com.znlccy.blog.core.condition.ResourceCondition;
import com.znlccy.blog.core.model.Resource;
import org.apache.ibatis.annotations.Param;

/**
 * The type IResourceService
 *
 * FileName：IResourceService.java
 * Description：	资源服务接口
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/29-13:07			create
 */
public interface IResourceService {

    /**
     * 添加资源
     * @param resource
     */
    void saveResource(Resource resource);

    /**
     * 查找资源
     * @param rsid
     * @return
     */
    Resource findResourceById(@Param("rsid") Long rsid);

    /**
     * 多条件查找资源
     * @param resourceCondition
     * @param pageSize
     * @param pageNum
     * @return
     */
    PageInfo<Resource> findResourceByCondition(ResourceCondition resourceCondition, int pageSize, int pageNum);

    /**
     * 更新资源
     * @param resource
     */
    void updateResource(Resource resource);

    /**
     * 删除资源
     * @param rsid
     */
    void deleteResourceById(@Param("rsid") Long rsid);

    /**
     * 资源总数
     * @return
     */
    Long getResourceCount();
}
