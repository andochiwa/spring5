package com.me.service.impl;

import com.me.dao.StudentDao;
import com.me.pojo.Student;
import com.me.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    // 为了xml的set使用的，与注解无关
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Autowired
    private StudentDao studentDao;


    @Override
    public int insert(Student student) {
        return studentDao.insert(student);
    }

    @Override
    public List<Student> queryAll() {
        return studentDao.selectAll();
    }
}
