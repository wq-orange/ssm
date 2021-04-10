package com.spring.dao.impl;

import com.spring.dao.UserDao;
import com.spring.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @author 南柯
 * @date 2021/4/8 17:10
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser(User user) {
        System.out.println("新增成功咯");
    }
}
