package com.me.service;

import com.me.dao.UserDao;

/**
 * 通过xml注入dao
 */
public class UserService {

    // 1.创建UserDao类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("service add...");
        userDao.update();
    }

}
