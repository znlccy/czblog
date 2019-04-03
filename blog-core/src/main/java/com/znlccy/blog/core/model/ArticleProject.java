package com.znlccy.blog.core.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * The type ArticleProject
 *
 * FileName：ArticleProject.java
 * Description：	文章项目实体类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/30-14:26			create
 */
@Data
@NoArgsConstructor
@ToString
public class ArticleProject extends BaseModel {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = -6247990178560252264L;

    /**
     * 文章主键
     */
    private Long atid;

    /**
     * 项目主键
     */
    private Long pjid;
}
