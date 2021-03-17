package com.me.autowire;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class EmployeeTest {

    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }

}