package com.znlccy.blog.core.mapper;

import com.znlccy.blog.core.condition.RoleCondition;
import com.znlccy.blog.core.model.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The type RoleMapper
 *
 * FileName：RoleMapper.java
 * Description：	角色Dao层
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/29-12:53			create
 */
@Mapper
public interface RoleMapper {

    /**
     * 保存角色
     * @param role
     */
    void saveRole(Role role);

    /**
     * 查找角色
     * @param roid
     * @return
     */
    Role findRoleById(@Param("roid") Long roid);

    /**
     * 多条件查找角色
     * @param roleCondition
     * @return
     */
    List<Role> findRoleByCondition(RoleCondition roleCondition);

    /**
     * 更新角色
     * @param role
     */
    void updateRole(Role role);

    /**
     * 删除角色
     * @param roid
     */
    void deleteRoleById(@Param("roid") Long roid);

    /**
     * 角色总数
     * @return
     */
    Long getRoleCount();
}
