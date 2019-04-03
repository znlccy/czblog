package com.znlccy.blog.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * The type BaseDto
 *
 * FileName：BaseDto.java
 * Description：	公共属性的类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-21:12			create
 */
@Data
@ToString
@AllArgsConstructor
public class BaseDto {

    /**
     * 用户名
     */
    private String username;

}
