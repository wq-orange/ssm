package com.spring.service.impl;

import com.spring.dao.UserDao;
import com.spring.pojo.User;
import com.spring.service.UserService;

/**
 * @author 南柯
 * @date 2021/4/8 17:14
 */
public class UserServiceImpl implements UserService {

    private UserDao dao;

    public UserDao getDao() {
        return dao;
    }

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void save(User user) {
        dao.addUser(user);
    }
}
