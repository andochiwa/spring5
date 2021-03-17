package com.me.service;

import com.me.config.Config;
import com.me.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

class StudentServiceTest {

    @Test
    void insert() {
    }

    // 使用xml
    @Test
    void queryAll2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = context.getBean("studentService", StudentService.class);
        List<Student> students = studentService.queryAll();
        students.forEach(System.out::println);

    }

    // 使用注解
    @Test
    void queryAll() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        StudentService studentService = context.getBean("studentServiceImpl", StudentService.class);
        List<Student> students = studentService.queryAll();
        students.forEach(System.out::println);

    }
}