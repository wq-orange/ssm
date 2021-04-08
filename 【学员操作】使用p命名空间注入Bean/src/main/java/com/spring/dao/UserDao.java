package com.spring.dao;

import com.spring.pojo.User;

/**
 * @author 南柯
 * @date 2021/4/8 17:09
 */
public interface UserDao {
    /**
     * 新增用户
     * @param user
     */
     void addUser(User user);
}
