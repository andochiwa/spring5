package com.me.spring5;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrdersTest {

    @Test
    public void testOrders() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);

    }
}