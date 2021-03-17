package com.me.bean;

public class Employee {

    private String name;
    private String gend;
    // 员工属于某个部门
    private Department department;

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gend='" + gend + '\'' +
                ", department=" + department +
                '}';
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGend(String gend) {
        this.gend = gend;
    }
}
