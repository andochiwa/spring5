package com.me.lifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class OrdersTest {
    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("4.对象创建完成，可以使用");

        // 手动让bean实例销毁
        context.close();
    }
}