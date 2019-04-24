package com.znlccy.blog.core.service;

import com.github.pagehelper.PageInfo;
import com.znlccy.blog.core.condition.ProjectCondition;
import com.znlccy.blog.core.model.Project;

import java.util.List;

/**
 * The type IProjectService
 *
 * FileName：IProjectService.java
 * Description：	项目服务接口类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-22:37			create
 */
public interface IProjectService {

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
    Project findProjectById(Long pjid);

    /**
     * 多条件查找配置
     * @param projectCondition
     * @param pageSize
     * @param pageNum
     * @return
     */
    PageInfo<Project> findProjectByCondition(ProjectCondition projectCondition, int pageSize, int pageNum);

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
