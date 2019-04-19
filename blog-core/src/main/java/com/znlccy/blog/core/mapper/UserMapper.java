package com.znlccy.blog.core.mapper;

import com.znlccy.blog.core.condition.UserCondition;
import com.znlccy.blog.core.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The type UserMapper 
 *
 * FileName：UserMapper.java
 * Description：	用户Dao层
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/28-21:05			create
 */
@Mapper
public interface UserMapper {

    /**
     * 添加用户
     * @param user
     */
    void saveUser(User user);

    /**
     * 查找用户
     * @param uid
     * @return
     */
    User findUserById(@Param("uid") Long uid);

    /**
     * 多条件查找用户
     * @param userCondition
     * @return
     */
    List<User> findUserByCondition(UserCondition userCondition);

    /**
     * 更新用户
     * @param user
     */
    void updateUser(User user);

    /**
     * 删除用户
     * @param uid
     */
    void deleteUserById(@Param("uid") Long uid);

    /**
     * 用户总数
     * @return
     */
    Long getUserCount();
}
