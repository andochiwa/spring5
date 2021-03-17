package com.me.service;

import com.me.config.SpringConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class UserServiceTest {

    // 基于xml
    @Test
    void testXml() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
        System.out.println(userService);
    }

    // 基于注解
    @Test
    void testAnnotation() {
        // 参数为注解配置类的class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
        System.out.println(userService);
    }
}