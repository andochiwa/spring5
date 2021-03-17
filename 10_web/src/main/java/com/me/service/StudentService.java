package com.me.service;

import com.me.pojo.Student;

import java.util.List;

public interface StudentService {

    int insert(Student student);

    List<Student> queryAll();

}
