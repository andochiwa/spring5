package com.me.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // lucy转账100给mary
    @Override
    public void addMoney() {
        String sql = "update account set money = money + ? where name = ?";
        jdbcTemplate.update(sql, 100, "mary");
    }

    @Override
    public void reduceMoney() {
        String sql = "update account set money = money - ? where name = ?";
        jdbcTemplate.update(sql, 100, "lucy");
    }
}
