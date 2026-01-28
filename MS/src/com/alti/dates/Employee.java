package com.alti.dates;

import java.time.LocalDate;

public class Employee {
     int id;
     String name;
     LocalDate dob;

    public Employee(int id, String name, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }
}
