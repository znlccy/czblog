package com.znlccy.blog.core.service;

import com.github.pagehelper.PageInfo;
import com.znlccy.blog.core.condition.UserCondition;
import com.znlccy.blog.core.model.User;

/**
 * The type IUserService 
 *
 * FileName：IUserService.java
 * Description：	用户服务接口
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-21:04			create
 */
public interface IUserService {

    /**
     * 添加用户
     * @param user
     */
    void save(User user);

    /**
     * 查找用户
     * @param uid
     * @return
     */
    User findUserById(Long uid);

    /**
     * 多条件查找用户
     * @param userCondition
     * @return
     */
    PageInfo<User> findUserByCondition(UserCondition userCondition, int pageSize, int pageNum);

    /**
     * 更新用户
     * @param user
     */
    void updateUser(User user);

    /**
     * 删除用户
     * @param uid
     */
    void deleteUserById(Long uid);

    /**
     * 用户总数
     * @return
     */
    Long getUserCount();
}
