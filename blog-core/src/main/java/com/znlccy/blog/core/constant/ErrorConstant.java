package com.znlccy.blog.core.constant;

/**
 * The type ErrorConstant
 *
 * FileName：ErrorConstant.java
 * Description：	错误常量
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/30-22:27			create
 */
public interface ErrorConstant {

    /**
     * 通用常量
     */
    interface Common {
        static final String PARAM_IS_EMPTY = "参数为空";
        static final String INVALID_PARAM = "无效参数";
        static final String CAN_NOT_FIND_PARAM_TO_CONTIUNE = "找不到参数，继续运行";
    }

    /**
     * 文章常量
     */
    interface Article {
        static final String ADD_NEW_ARTICLE_FAIL = "添加文章失败";
        static final String UPDATE_ARTICLE_FAIL = "更新文章失败";
        static final String DELETE_ARTICLE_FAIL = "删除文章失败";
        static final String TITLE_IS_TOO_LONG = "文章标题过长";
        static final String TITLE_CAN_NOT_EMPTY = "文章标题不能为空";
        static final String CONTENT_CAN_NOT_EMPTY = "文章内容不能为空";
        static final String CONTENT_IS_TOO_LONG = "文章字数超过限制";
    }

    /**
     * 文件常量
     */
    interface Attachment {
        static final String ADD_NEW_ATTACHMENT_FAIL = "添加附件信息失败";
        static final String UPDATE_ATTACHMENT_FAIL = "更新附件信息失败";
        static final String DELETE_ATTACHMENT_FAIL = "删除附件信息失败";
        static final String UPLOAD_FILE_FAIL = "上传附件失败";
    }

    /**
     * 评论常量
     */
    interface Comment {
        static final String ADD_NEW_COMMENT_FAIL = "添加评论失败";
        static final String UPDATE_COMMENT_FAIL = "更新评论失败";
        static final String DELETE_COMMENT_FAIL = "删除评论失败";
        static final String COMMENT_NOT_EXIST = "评论不存在";
    }

    /**
     * 配置常量
     */
    interface Config {
        static final String ADD_CONFIG_FAIL = "添加配置失败";
        static final String UPDATE_CONFIG_FAIL = "更新配置失败";
        static final String DELETE_CONFIG_FAIL = "删除配置失败";
    }

    /**
     * 日志常量
     */
    interface Log {
        static final String ADD_LOG_FAIL = "添加日志失败";
        static final String DELETE_LOG_FAIL = "删除日志失败";
    }

    /**
     * 项目常量
     */
    interface Project {
        static final String ADD_CONFIG_FAIL = "添加配置失败";
        static final String UPDATE_CONFIG_FAIL = "更新配置失败";
        static final String DELETE_CONFIG_FAIL = "删除配置失败";
    }

    /**
     * 资源常量
     */
    interface Resource {
        static final String ADD_CONFIG_FAIL = "添加配置失败";
        static final String UPDATE_CONFIG_FAIL = "更新配置失败";
        static final String DELETE_CONFIG_FAIL = "删除配置失败";
    }

    /**
     * 角色常量
     */
    interface Role {
        static final String ADD_CONFIG_FAIL = "添加配置失败";
        static final String UPDATE_CONFIG_FAIL = "更新配置失败";
        static final String DELETE_CONFIG_FAIL = "删除配置失败";
    }

    /**
     * 用户常量
     */
    interface Auth {
        static final String ADD_CONFIG_FAIL = "添加配置失败";
        static final String UPDATE_CONFIG_FAIL = "更新配置失败";
        static final String DELETE_CONFIG_FAIL = "删除配置失败";
    }
}

