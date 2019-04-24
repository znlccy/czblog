package com.znlccy.blog.core.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.znlccy.blog.core.condition.LogCondition;
import com.znlccy.blog.core.mapper.LogMapper;
import com.znlccy.blog.core.model.Log;
import com.znlccy.blog.core.service.ILogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * The type LogServiceImpl
 *
 * FileName：LogServiceImpl.java
 * Description：	日志服务实现类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-22:40			create
 */
@Service
public class LogServiceImpl implements ILogService {

    /**
     * 依赖注入LogMapper
     */
    @Autowired
    private LogMapper logMapper;

    /**
     * 添加日志
     * @param log
     */
    @Transactional
    @Override
    public void saveLog(Log log) {
        logMapper.saveLog(log);
    }

    /**
     * 查找日志
     * @param lid
     * @return
     */
    @Override
    public Log findLogById(Long lid) {
        return logMapper.findLogById(lid);
    }

    /**
     * 多条件查找日志
     * @param logCondition
     * @param pageSize
     * @param pageNum
     * @return
     */
    @Override
    public PageInfo<Log> findLogByCondition(LogCondition logCondition, int pageSize, int pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        List<Log> logs = logMapper.findLogByCondition(logCondition);
        PageInfo<Log> pageInfo = new PageInfo<>(logs);
        return pageInfo;
    }

    /**
     * 删除日志
     * @param lid
     */
    @Transactional
    @Override
    public void deleteLogById(Long lid) {
        logMapper.deleteLogById(lid);
    }

    /**
     * 日志总数
     * @return
     */
    @Override
    public Long getLogCount() {
        return logMapper.getLogCount();
    }
}
