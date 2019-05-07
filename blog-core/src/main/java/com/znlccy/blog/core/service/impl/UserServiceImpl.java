package com.znlccy.blog.core.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.znlccy.blog.core.condition.UserCondition;
import com.znlccy.blog.core.mapper.UserMapper;
import com.znlccy.blog.core.model.User;
import com.znlccy.blog.core.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * The type UserServiceImpl
 *
 * FileName：UserServiceImpl.java
 * Description：	用户服务实现类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-21:04			create
 */
@Service
public class UserServiceImpl implements IUserService {

    /**
     * 注入UserMapper
     */
    @Autowired
    private UserMapper userMapper;

    /**
     * 添加用户
     * @param user
     */
    @Transactional
    @CacheEvict(value = {"userCache", "userCaches"}, allEntries = true, beforeInvocation = true)
    @Override
    public void save(User user) {
        userMapper.saveUser(user);
    }

    /**
     * 查找用户
     * @param uid
     * @return
     */
    @Cacheable(value = "userCache", key = "'userById' + #p0")
    @Override
    public User findUserById(Long uid) {
        return userMapper.findUserById(uid);
    }

    /**
     * 多条件查找用户
     * @param userCondition
     * @return
     */
    @Cacheable(value = "userCaches")
    @Override
    public PageInfo<User> findUserByCondition(UserCondition userCondition, int pageSize, int pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userMapper.findUserByCondition(userCondition);
        PageInfo<User> pageInfo = new PageInfo<>(users);
        return pageInfo;
    }

    /**
     * 更新用户
     * @param user
     */
    @Transactional
    @CacheEvict(value = {"userCache", "userCaches"}, allEntries = true, beforeInvocation = true)
    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    /**
     * 删除用户
     * @param uid
     */
    @CacheEvict(value = {"userCache", "userCaches"}, allEntries = true, beforeInvocation = true)
    @Override
    public void deleteUserById(Long uid) {
        userMapper.deleteUserById(uid);
    }

    /**
     * 用户总数
     * @return
     */
    @Cacheable(value = "userCache", key = "user_count")
    @Override
    public Long getUserCount() {
        return userMapper.getUserCount();
    }
}
