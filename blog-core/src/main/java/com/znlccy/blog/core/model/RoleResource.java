package com.znlccy.blog.core.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * The type RoleResource 
 *
 * FileName：RoleResource.java
 * Description：	角色资源实体类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/29-10:51			create
 */
@Data
@NoArgsConstructor
@ToString
public class RoleResource extends BaseModel {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = 791171382437158210L;

    /**
     * 角色主键
     */
    private Long roleId;

    /**
     * 资源主键
     */
    private Long resourceId;
}
