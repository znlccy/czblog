package com.znlccy.blog.core.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.znlccy.blog.core.condition.ProjectCondition;
import com.znlccy.blog.core.mapper.ProjectMapper;
import com.znlccy.blog.core.model.Project;
import com.znlccy.blog.core.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * The type ProjectServiceImpl
 *
 * FileName：ProjectServiceImpl.java
 * Description：	项目服务实现类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-22:46			create
 */
@Service
public class ProjectServiceImpl implements IProjectService {

    /**
     * 依赖注入ProjectMapper
     */
    @Autowired
    private ProjectMapper projectMapper;

    /**
     * 添加配置
     * @param project
     */
    @Transactional
    @Override
    public void saveProject(Project project) {
        projectMapper.saveProject(project);
    }

    /**
     * 查找配置
     * @param pjid
     * @return
     */
    @Override
    public Project findProjectById(Long pjid) {
        return projectMapper.findProjectById(pjid);
    }

    /**
     * 多条件查找配置
     * @param projectCondition
     * @param pageSize
     * @param pageNum
     * @return
     */
    @Override
    public PageInfo<Project> findProjectByCondition(ProjectCondition projectCondition, int pageSize, int pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        List<Project> projects = projectMapper.findProjectByCondition(projectCondition);
        PageInfo<Project> pageInfo = new PageInfo<>(projects);
        return pageInfo;
    }

    /**
     * 更新配置
     * @param project
     */
    @Transactional
    @Override
    public void updateProject(Project project) {
        projectMapper.updateProject(project);
    }

    /**
     * 删除配置
     * @param pjid
     */
    @Transactional
    @Override
    public void deleteProjectById(Long pjid) {
        projectMapper.deleteProjectById(pjid);
    }

    /**
     * 配置总数
     * @return
     */
    @Override
    public Long getProjectCount() {
        return projectMapper.getProjectCount();
    }
}
