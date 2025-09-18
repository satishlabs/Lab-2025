package com.ip;

class Employee {
    private int id;
    private String name;
    private String dept;
    private double salary;

    // constructor, getters, toString
    public Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getDept() { return dept; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return id + " - " + name + " - " + dept + " - " + salary;
    }
}
