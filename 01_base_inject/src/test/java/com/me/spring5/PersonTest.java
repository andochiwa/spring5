package com.me.spring5;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }

}