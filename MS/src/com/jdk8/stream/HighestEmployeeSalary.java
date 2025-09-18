package com.jdk8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HighestEmployeeSalary {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(1, "Satish", 50000),
                new Employee(2, "Bob", 75000),
                new Employee(3, "Charlie", 60000)
        );

        Employee noEmployessFound = empList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow(() -> new RuntimeException("No Employess found"));

        System.out.println("Highest Paid Employee: "+noEmployessFound.getName()+" : "+noEmployessFound.getSalary());
    }
}
