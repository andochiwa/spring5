package com.me.aop.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class UserTest {

    @org.junit.jupiter.api.Test
    void add() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}