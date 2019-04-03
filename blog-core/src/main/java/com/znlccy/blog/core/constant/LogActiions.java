package com.znlccy.blog.core.constant;

/**
 * The type LogActiions 
 *
 * FileName：LogActiions.java
 * Description：	日志动作行为
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/31-11:51			create
 */
public enum LogActiions {

    /**
     * 定义一些常量
     */
    LOGIN("登录后台"),
    UPDATE_PWD("修改密码"),
    UPDATE_INFO("修改个人信息"),
    DEL_ARTICLE("删除文章"),
    SYS_SETTING("保存系统设置"),
    DEL_ATTACH("删除附件");

    /**
     * 定义行为
     */
    private String action;

    /**
     * 获取行为
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * 设置行为
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * 默认构造函数
     * @param action
     */
    LogActiions(String action) {
        this.action = action;
    }
}
