package com.znlccy.blog.core.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * The type Role
 *
 * FileName：Role.java
 * Description：	角色实体类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/29-10:47			create
 */
@Data
@NoArgsConstructor
@ToString
public class Role extends BaseModel {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = -3631033284878495778L;

    /**
     * 角色主键
     */
    private Long roid;

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
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
