package com.jdk8.stream;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;
    private String gender;
    public Employee(){}

    public Employee(int id, String name, double salary, String department, String gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
