package com.znlccy.blog.core.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.znlccy.blog.core.condition.ConfigCondition;
import com.znlccy.blog.core.mapper.ConfigMapper;
import com.znlccy.blog.core.model.Config;
import com.znlccy.blog.core.service.IConfigService;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * The type ConfigServiceImpl
 *
 * FileName：ConfigServiceImpl.java
 * Description：	网站配置实现类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-22:43			create
 */
@Service
public class ConfigServiceImpl implements IConfigService {

    /**
     * 注入ConfigMapper
     */
    @Autowired
    private ConfigMapper configMapper;

    /**
     * 添加配置
     * @param config
     */
    @Transactional
    @CacheEvict(value = {"configCache", "configCaches"}, allEntries = true, beforeInvocation = true)
    @Override
    public void saveConfig(Config config) {
        configMapper.saveConfig(config);
    }

    /**
     * 查找配置
     * @param cfid
     * @return
     */
    @Cacheable(value = "configCache", key = "'configById_' + #p0")
    @Override
    public Config findConfigById(Long cfid) {
        return configMapper.findConfigById(cfid);
    }

    /**
     * 多条件查找配置
     * @param configCondition
     * @param pageSize
     * @param pageNum
     * @return
     */
    @Cacheable(value = "configCaches")
    @Override
    public PageInfo<Config> findConfigByCondition(ConfigCondition configCondition, int pageSize, int pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        List<Config> configs = configMapper.findConfigByCondition(configCondition);
        PageInfo<Config> pageInfo = new PageInfo<>(configs);
        return pageInfo;
    }

    /**
     * 更新配置
     * @param config
     */
    @Transactional
    @CacheEvict(value = {"configCache", "configCaches"}, allEntries = true, beforeInvocation = true)
    @Override
    public void updateConfig(Config config) {
        configMapper.updateConfig(config);
    }

    /**
     * 删除配置
     * @param cfid
     */
    @Transactional
    @CacheEvict(value = {"configCache", "configCaches"}, allEntries = true, beforeInvocation = true)
    @Override
    public void deleteConfigById(Long cfid) {
        configMapper.deleteConfigById(cfid);
    }

    /**
     * 配置总数
     * @return
     */
    @Cacheable(value = "configCache", key = "config_count")
    @Override
    public Long getConfigCount() {
        return configMapper.getConfigCount();
    }
}
