package com.znlccy.blog.core.mapper;

import com.znlccy.blog.core.condition.LogCondition;
import com.znlccy.blog.core.model.Log;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The type LogMapper 
 *
 * FileName：LogMapper.java
 * Description：	日志Dao层
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-22:46			create
 */
@Mapper
public interface LogMapper {

    /**
     * 添加日志
     * @param log
     */
    void saveLog(Log log);

    /**
     * 查找日志
     * @param lid
     * @return
     */
    Log findLogById(@Param("lid") Long lid);

    /**
     * 多条件查找日志
     * @param logCondition
     * @return
     */
    List<Log> findLogByCondition(LogCondition logCondition);

    /**
     * 删除日志
     * @param lid
     */
    void deleteLogById(@Param("lid") Long lid);

    /**
     * 日志总数
     * @return
     */
    Long getLogCount();
}
