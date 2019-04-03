package com.znlccy.blog.core.constant;

/**
 * The type Types
 *
 * FileName：Types.java
 * Description：	文件类型
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/31-12:02			create
 */
public enum  Types {

    //分类
    CATEGORY("category"),
    //标签
    TAG("tag"),
    //文章
    ARTICLE("post"),
    //CSEF Token
    CSRF_TOKEN("csrf_token"),
    //链接
    LINK("link"),
    //评论
    COMMENT_FREQUENCY("category_frequency"),
    //图片
    IMAGE("image"),
    //文件
    FILE("file"),
    //附件
    ATTACH_URL("http://pb84kab39.bkt.clouddn.com/");

    /**
     * 文件类型
     */
    private String type;

    /**
     * 获取文件类型
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * 设置文件类型
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 默认构造函数
     * @param type
     */
    Types(String type) {
        this.type = type;
    }
}
