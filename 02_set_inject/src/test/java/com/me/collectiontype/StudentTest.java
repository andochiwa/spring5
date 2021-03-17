package com.me.collectiontype;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }

}