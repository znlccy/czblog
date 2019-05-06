package com.znlccy.blog.core.mapper;

import com.znlccy.blog.core.condition.ResourceCondition;
import com.znlccy.blog.core.model.Resource;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The type ResourceMapper 
 *
 * FileName：ResourceMapper.java
 * Description：	资源Dao层
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/29-12:56			create
 */
@Mapper
public interface ResourceMapper {

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
     * @return
     */
    List<Resource> findResourceByCondition(ResourceCondition resourceCondition);

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
