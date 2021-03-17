package com.me.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Student {
    // 数组类型
    private String[] courses;

    // list类型
    private List<String> list;

    @Override
    public String toString() {
        return "Student{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", map=" + map +
                ", courseList=" + courseList +
                '}';
    }

    // map类型
    private Map<String, String> map;

    // 学生所学的多门课程
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
