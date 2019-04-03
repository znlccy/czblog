package com.znlccy.blog.core.condition;

import lombok.Data;

import java.util.Date;

/**
 * The type RoleCondition 
 *
 * FileName：RoleCondition.java
 * Description：	角色多条件查询
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/30-20:27			create
 */
@Data
public class RoleCondition {

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色键值
     */
    private String roleKey;

    /**
     * 角色状态
     */
    private Integer status;

    /**
     * 角色描述
     */
    private String description;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;
}
