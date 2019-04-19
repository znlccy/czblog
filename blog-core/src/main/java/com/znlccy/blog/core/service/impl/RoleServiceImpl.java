package com.znlccy.blog.core.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.znlccy.blog.core.condition.RoleCondition;
import com.znlccy.blog.core.constant.ErrorConstant;
import com.znlccy.blog.core.exception.BusinessException;
import com.znlccy.blog.core.mapper.RoleMapper;
import com.znlccy.blog.core.model.Role;
import com.znlccy.blog.core.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type RoleServiceImpl
 *
 * FileName：RoleServiceImpl.java
 * Description：	角色服务实现类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/29-13:04			create
 */
@Service
public class RoleServiceImpl implements IRoleService {

    /**
     * 注入RoleMapper
     */
    @Autowired
    private RoleMapper roleMapper;

    /**
     * 添加角色
     * @param role
     */
    @Override
    public void saveRole(Role role) {
        roleMapper.saveRole(role);
    }

    /**
     * 查找角色
     * @param roid
     * @return
     */
    @Override
    public Role findRoleById(Long roid) {
        return roleMapper.findRoleById(roid);
    }

    /**
     * 多条件查找角色
     * @param roleCondition
     * @param pageSize
     * @param pageNum
     * @return
     */
    @Override
    public PageInfo<Role> findRoleByCondition(RoleCondition roleCondition, int pageSize, int pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        List<Role> roles = roleMapper.findRoleByCondition(roleCondition);
        PageInfo<Role> pageInfo = new PageInfo<>(roles);
        return pageInfo;
    }

    /**
     * 更新角色
     * @param role
     */
    @Override
    public void updateRole(Role role) {
        roleMapper.updateRole(role);
    }

    /**
     * 删除角色
     * @param roid
     */
    @Override
    public void deleteRoleById(Long roid) {
        if (null == roid) {
            throw new BusinessException(ErrorConstant.Common.PARAM_IS_EMPTY);
        }
    }

    /**
     * 角色总数
     * @return
     */
    @Override
    public Long getRoleCount() {
        return roleMapper.getRoleCount();
    }
}
