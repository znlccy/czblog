package com.znlccy.blog.core.mapper;

import com.znlccy.blog.core.condition.ProjectCondition;
import com.znlccy.blog.core.model.Project;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The type ProjectMapper
 *
 * FileName：ProjectMapper.java
 * Description：	项目Dao层
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-22:48			create
 */
@Mapper
public interface ProjectMapper {

    /**
     * 添加配置
     * @param project
     */
    void saveProject(Project project);

    /**
     * 查找配置
     * @param pjid
     * @return
     */
    Project findProjectById(@Param("pjid") Long pjid);

    /**
     * 多条件查找配置
     * @param projectCondition
     * @return
     */
    List<Project> findProjectByCondition(ProjectCondition projectCondition);

    /**
     * 更新配置
     * @param project
     */
    void updateProject(Project project);

    /**
     * 删除配置
     * @param pjid
     */
    void deleteProjectById(Long pjid);

    /**
     * 配置总数
     * @return
     */
    Long getProjectCount();
}
