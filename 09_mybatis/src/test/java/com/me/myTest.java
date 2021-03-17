package com.me;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {

    @Test
    void test1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(context.getBean(name));
        }
    }
}
