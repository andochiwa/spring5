package com.me.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }

}