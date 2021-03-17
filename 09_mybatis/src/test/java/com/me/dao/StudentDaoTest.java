package com.me.dao;

import com.github.pagehelper.PageHelper;
import com.me.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

class StudentDaoTest {

    @Test
    void insert() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        studentDao.insert(new Student(null, "林俊杰", null, "lin@he"));
    }

    @Test
    void selectAll() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(context.getBeanDefinitionCount());
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        PageHelper.startPage(1, 5);
        List<Student> students = studentDao.selectAll();
        students.forEach(System.out::println);

    }


}