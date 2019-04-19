package com.znlccy.blog.core.service;

import com.github.pagehelper.PageInfo;
import com.znlccy.blog.core.condition.ConfigCondition;
import com.znlccy.blog.core.model.Config;

/**
 * The type IConfigService
 *
 * FileName：IConfigService.java
 * Description：	配置服务接口类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-22:34			create
 */
public interface IConfigService {

    /**
     * 添加配置
     * @param config
     */
    void saveConfig(Config config);

    /**
     * 查找配置
     * @param cfid
     * @return
     */
    Config findConfigById(Long cfid);

    /**
     * 多条件查找配置
     * @param configCondition
     * @param pageSize
     * @param pageNum
     * @return
     */
    PageInfo<Config> findConfigByCondition(ConfigCondition configCondition, int pageSize, int pageNum);

    /**
     * 更新配置
     * @param config
     */
    void updateConfig(Config config);

    /**
     * 删除配置
     * @param cfid
     */
    void deleteConfigById(Long cfid);

    /**
     * 配置总数
     * @return
     */
    Long getConfigCount();
}
