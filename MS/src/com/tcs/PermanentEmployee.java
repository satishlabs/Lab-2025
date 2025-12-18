package com.tcs;

public class PermanentEmployee implements Employee{
    private int id;
    private String name;
    private double salary;

    public PermanentEmployee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return "";
    }

    public double getSalary() {
        return salary;
    }
}
