package com.alti.interview;

import java.util.List;
import java.util.stream.Collectors;

public class NameBasedOnDepartment {
    static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1,"Satish",250000,"Male","HR"),
                new Employee(2,"Prasad",200000,"Male", "IT"),
                new Employee(3,"Anu",150000,"FeMale","CS"),
                new Employee(4,"Ramesh",350000,"Male","IT"),
                new Employee(5,"Kaushik",253000,"Male","HR")
        );

        employees.stream()
                .collect(Collectors.groupingBy(Employee::department, Collectors.groupingBy(Employee::name)))
                .entrySet()
                .forEach(System.out::println);
        System.out.println("\n====================");
        employees.stream()
                .collect(Collectors.groupingBy(Employee::department, Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);
    }
}
