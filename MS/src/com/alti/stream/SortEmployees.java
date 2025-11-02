package com.alti.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployees {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Satish", 50000),
                new Employee("Amit", 40000),
                new Employee("John", 40000),
                new Employee("Neha", 60000),
                new Employee("Balu", 50000)
        );

        List<Employee> sortedList = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName))
                .toList();
        System.out.println("Sorted Emps");
        sortedList.forEach(System.out::println);
    }
}
