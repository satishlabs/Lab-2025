package com.hexaware;

import java.util.*;

public class EmployeeStream {
    static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"AAA", 12000, "HR"),
                new Employee(2, "BBB", 15000, "CS"),
                new Employee(3, "CCC", 10000, "IT")
        );

        //Find the employee with maximum salary using Stream API
        Optional<Employee> first = employeeList.stream()
                .max(Comparator.comparing(Employee::salary))
                .stream()
                .findFirst();
        System.out.println(first);
    }
}
