package com.me.dao.impl;

import com.me.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("dao add...");

    }

    @Override
    public void delete() {
        System.out.println("dao delete...");
    }
}
