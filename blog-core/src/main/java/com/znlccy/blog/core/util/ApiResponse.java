package com.znlccy.blog.core.util;

/**
 * The type ApiResponse 
 *
 * FileName：ApiResponse.java
 * Description：	Api返回值
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/30-21:48			create
 */
public class ApiResponse<T> {

    /**
     * 成功信息
     */
    private static final String CODE_SUCCESS = "success";

    /**
     * 失败信息
     */
    private static final String CODE_FAIL = "fail";

    /**
     * 状态码
     */
    private String code;

    /**
     * 返回数据
     */
    private T data;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 默认构造函数
     */
    public ApiResponse() {
    }

    /**
     * 带有code的构造函数
     * @param code
     */
    public ApiResponse(String code) {
        this.code = code;
    }

    /**
     * 带有code和data的构造函数
     * @param code
     * @param data
     */
    public ApiResponse(String code, T data) {
        this.code = code;
        this.data = data;
    }

    /**
     * 带有code和msg的构造函数
     * @param code
     * @param msg
     */
    public ApiResponse(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 带有code, data, msg的构造函数
     * @param code
     * @param data
     * @param msg
     */
    public ApiResponse(String code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    /**
     * 成功返回状态
     * @return
     */
    public static ApiResponse success() {
        return new ApiResponse(CODE_SUCCESS);
    }

    /**
     * 成功返回状态数据
     * @param data
     * @return
     */
    public static ApiResponse success(Object data) {
        return new ApiResponse(CODE_SUCCESS, data);
    }

    /**
     * 成功返回信息数据
     * @param msg
     * @param data
     * @return
     */
    public static ApiResponse success(String msg, Object data) {
        return new ApiResponse(CODE_SUCCESS, data, msg);
    }

    /**
     * 返回错误信息
     * @param msg
     * @return
     */
    public static ApiResponse fail(String msg) {
        return new ApiResponse(CODE_FAIL, msg);
    }

    /**
     * 带有错误码
     * @param errorCode
     * @return
     */
    public static ApiResponse withCode(String errorCode) {
        return new ApiResponse(errorCode);
    }

    /**
     * 获取状态码
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置状态码
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取数据
     * @return
     */
    public T getData() {
        return data;
    }

    /**
     * 设置数据
     * @param data
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * 获取信息
     * @return
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置信息
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
