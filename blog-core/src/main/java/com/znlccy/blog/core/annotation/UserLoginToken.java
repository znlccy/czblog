package com.znlccy.blog.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The type UserLoginToken 
 *
 * FileName：UserLoginToken.java
 * Description：	
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/4/1-10:52			create
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface UserLoginToken {

    /**
     * 必填的选项
     * @return
     */
    boolean required() default true;
}
