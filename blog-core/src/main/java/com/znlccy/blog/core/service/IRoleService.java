package com.znlccy.blog.core.service;

import com.github.pagehelper.PageInfo;
import com.znlccy.blog.core.condition.RoleCondition;
import com.znlccy.blog.core.model.Role;

/**
 * The type IRoleService 
 *
 * FileName：IRoleService.java
 * Description：	角色服务接口
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/29-13:03			create
 */
public interface IRoleService {

    /**
     * 添加角色
     * @param role
     */
    void saveRole(Role role);

    /**
     * 查找角色
     * @param roid
     * @return
     */
    Role findRoleById(Long roid);

    /**
     * 多条件查询角色
     * @param roleCondition
     * @param pageSize
     * @param pageNum
     * @return
     */
    PageInfo<Role> findRoleByCondition(RoleCondition roleCondition, int pageSize, int pageNum);

    /**
     * 更新角色
     * @param role
     */
    void updateRole(Role role);

    /**
     * 删除角色
     * @param roid
     */
    void deleteRoleById(Long roid);

    /**
     * 角色总数
     * @return
     */
    Long getRoleCount();


}
