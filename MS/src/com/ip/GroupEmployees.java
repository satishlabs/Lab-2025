package com.ip;

import java.util.*;
import java.util.stream.Collectors;

public class GroupEmployees {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Satish", "IT", 70000),
                new Employee(2, "Amit", "HR", 50000),
                new Employee(3, "Prasad", "IT", 60000),
                new Employee(4, "John", "Finance", 65000),
                new Employee(5, "Sneha", "HR", 55000),
                new Employee(6, "Rahul", "IT", 60000)
        );

        Map<String, List<Employee>> groupedByDept = employees.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName))
                .collect(Collectors.groupingBy(Employee::getDept, LinkedHashMap::new, Collectors.toList()));

        groupedByDept.forEach((dept, empList) ->{
            System.out.println("Department : "+dept);
            empList.forEach(System.out::println);
        });
    }
}
