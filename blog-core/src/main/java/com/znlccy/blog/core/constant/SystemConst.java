package com.znlccy.blog.core.constant;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * The type SystemConst
 *
 * FileName：SystemConst.java
 * Description：	系统常量
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/31-11:48			create
 */
@Component
public class SystemConst {

    /**
     * 网站配置
     */
    public static Map<String, String> initConfig = new HashMap<>();

    /**
     * 用户登录session和key
     */
    public static String LOGIN_SESSION_KEY = "login_user";

    /**
     * 用户登录cookie和key
     */
    public static final String USER_IN_COOKIE = "S_L_ID";

    /**
     * AES加密加盐
     */
    public static String AES_SALT = "603czcnyl704";

    /**
     * 最大获取文章条数
     */
    public static final int MAX_POSTS = 9999;

    /**
     * 文标题最多可以输入的文字个数
     */
    public static final int MAX_TITLE_COUNT = 200;

    /**
     * 文章内容最多可以输入的文字个数
     */
    public static final int MAX_CONTENT_COUNT = 200000;

    /**
     * 点击次数超过铄和更新到数据库
     */
    public static final int HIT_EXEED = 10;

    /**
     * 上传文件最大1M
     */
    public static Integer MAX_FILE_SIZE = 1048576;
}
