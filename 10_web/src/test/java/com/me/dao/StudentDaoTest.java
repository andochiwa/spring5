package com.me.dao;

import com.me.config.Config;
import com.me.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class StudentDaoTest {

    @Test
    void insert() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        studentDao.insert(new Student(null, "林俊杰", null, "lin@he"));
    }

    @Test
    void insert2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        studentDao.insert(new Student(null, "他", null, "ta@me"));
    }

    @Test
    void selectAll() {
    }


}