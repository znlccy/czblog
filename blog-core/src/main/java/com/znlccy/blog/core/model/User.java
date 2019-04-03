package com.znlccy.blog.core.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * The type User
 *
 * FileName：User.java
 * Description：	用户实体类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-20:59			create
 */
@Data
@NoArgsConstructor
@ToString
public class User extends BaseModel {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = 5146775673763497231L;

    /**
     * 用户主键
     */
    private Long uid;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户显示名
     */
    private String displayName;

    /**
     * 用户登录时间
     */
    private Date loginTime;

    /**
     * 用户活跃时间
     */
    private Date activeTime;

    /**
     * 用户创建时间
     */
    private Date createTime;

    /**
     * 用户更新时间
     */
    private Date updateTime;
}
