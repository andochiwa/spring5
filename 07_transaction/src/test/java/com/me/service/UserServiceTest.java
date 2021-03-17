package com.me.service;

import com.me.config.TxConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class UserServiceTest {

    @org.junit.jupiter.api.Test
    void transferMoney() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.transferMoney();
    }

    @org.junit.jupiter.api.Test
    void transferMoney2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.transferMoney();
    }
}