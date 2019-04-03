package com.znlccy.blog.core.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * The type UserRole
 *
 * FileName：UserRole.java
 * Description：	用户角色实体类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/29-10:52			create
 */
@Data
@NoArgsConstructor
@ToString
public class UserRole extends BaseModel {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = 1288001700371431256L;

    /**
     * 用户主键
     */
    private Long userId;

    /**
     * 角色主键
     */
    private Long roleId;
}
