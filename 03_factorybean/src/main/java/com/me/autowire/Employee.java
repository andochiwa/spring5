package com.me.autowire;

public class Employee {
    private Department department;

    public void test() {
        System.out.println(department);
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department=" + department +
                '}';
    }
}
