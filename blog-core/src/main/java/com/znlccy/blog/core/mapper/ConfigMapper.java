package com.znlccy.blog.core.mapper;

import com.znlccy.blog.core.condition.ConfigCondition;
import com.znlccy.blog.core.model.Config;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The type ConfigMapper
 *
 * FileName：ConfigMapper.java
 * Description：	网站配置Dao层
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-22:48			create
 */
@Mapper
public interface ConfigMapper {

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
    Config findConfigById(@Param("cfid") Long cfid);

    /**
     * 多条件查找配置
     * @param configCondition
     * @return
     */
    List<Config> findConfigByCondition(ConfigCondition configCondition);

    /**
     * 更新配置
     * @param config
     */
    void updateConfig(Config config);

    /**
     * 删除配置
     * @param cfid
     */
    void deleteConfigById(@Param("cfid") Long cfid);
}
