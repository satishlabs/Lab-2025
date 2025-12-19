package com.embetal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeInDesc {
    static void main() {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Satish", 30, 10000.0),
                new Employee(2, "Prasad", 42, 20000.0),
                new Employee(3, "Kumar", 35, 15000.0),
                new Employee(4, "Amit", 50, 11000.0)
        );

       List<String> result =  employeeList.stream()
                .filter(e -> e.getAge() > 40)
                .filter(e ->e.getSalary() > 11000.0)
                .map(Employee::getName)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
