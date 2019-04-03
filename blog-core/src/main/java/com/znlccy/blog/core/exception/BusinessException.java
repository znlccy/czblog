package com.znlccy.blog.core.exception;

import com.znlccy.blog.core.util.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.MessageFormat;

/**
 * The type BusinessException
 *
 * FileName：BusinessException.java
 * Description：	基类异常类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-21:05			create
 */
public class BusinessException extends RuntimeException {

    /**
     * 打印日志
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(BusinessException.class);

    protected String errorCode;

    protected String[] errorMessageArgument;

    protected ApiResponse apiResponse;

    /**
     * 默认构造器
     */
    public BusinessException() {
        this("");
    }

    public BusinessException(String message) {
        super(message);
        this.errorCode = "fail";
        this.errorMessageArgument = new String[0];
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
        this.errorCode = "fail";
        this.errorMessageArgument = new String[0];
    }

    public static BusinessException withErrorCode(String errorCode) {
        BusinessException businessException = new BusinessException();
        businessException.errorCode = errorCode;
        return businessException;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String[] getErrorMessageArgument() {
        return errorMessageArgument;
    }

    private BusinessException withErrorMissageArguments(String... errorMessageArgument) {
        if (errorMessageArgument != null) {
            this.errorMessageArgument = errorMessageArgument;
        }
        return this;
    }

    public ApiResponse response() {
        if (this.apiResponse != null) {
            return this.apiResponse;
        } else {
            this.apiResponse = ApiResponse.withCode(this.errorCode);
            if (this.getErrorMessageArgument() != null && this.getErrorMessageArgument().length > 0) {
                try {
                    this.apiResponse.setMsg(MessageFormat.format(this.apiResponse.getMsg(),this.getErrorMessageArgument()));
                } catch (Exception e) {
                    LOGGER.error(e.getMessage());
                }
            }
        }
        return this.apiResponse;
    }
}
