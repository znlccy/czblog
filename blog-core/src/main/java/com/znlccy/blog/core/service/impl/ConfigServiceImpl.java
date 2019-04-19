package com.znlccy.blog.core.service.impl;

import com.github.pagehelper.PageInfo;
import com.znlccy.blog.core.condition.ConfigCondition;
import com.znlccy.blog.core.model.Config;
import com.znlccy.blog.core.service.IConfigService;
import org.springframework.stereotype.Service;

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

    @Override
    public void saveConfig(Config config) {

    }

    @Override
    public Config findConfigById(Long cfid) {
        return null;
    }

    @Override
    public PageInfo<Config> findConfigByCondition(ConfigCondition configCondition, int pageSize, int pageNum) {
        return null;
    }

    @Override
    public void updateConfig(Config config) {

    }

    @Override
    public void deleteConfigById(Long cfid) {

    }

    @Override
    public Long getConfigCount() {
        return null;
    }
}
