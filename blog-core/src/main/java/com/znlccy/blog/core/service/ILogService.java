package com.znlccy.blog.core.service;

import com.github.pagehelper.PageInfo;
import com.znlccy.blog.core.condition.LogCondition;
import com.znlccy.blog.core.model.Log;

/**
 * The type ILogService
 *
 * FileName：ILogService.java
 * Description：	日志服务接口类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-22:35			create
 */
public interface ILogService {

    /**
     * 保存日志
     * @param log
     */
    void saveLog(Log log);

    /**
     * 查找日志
     * @param lid
     * @return
     */
    Log findLogById(Long lid);

    /**
     * 多条件查找日志
     * @param logCondition
     * @param pageSize
     * @param pageNum
     * @return
     */
    PageInfo<Log> findLogByCondition(LogCondition  logCondition, int pageSize, int pageNum);

    /**
     * 删除日志
     * @param lid
     */
    void deleteLogById(Long lid);

    /**
     * 日志总数
     * @return
     */
    Long getLogCount();
}
