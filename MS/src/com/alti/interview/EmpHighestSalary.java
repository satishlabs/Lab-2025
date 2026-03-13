package com.alti.interview;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpHighestSalary {
    static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1,"Satish",250000,"Male","HR"),
                new Employee(2,"Prasad",200000,"Male", "IT"),
                new Employee(3,"Anu",150000,"FeMale","CS"),
                new Employee(4,"Ramesh",350000,"Male","IT"),
                new Employee(5,"Kaushik",253000,"Male","HR")
        );

        employees.stream()
                .max(Comparator.comparing(Employee::salary))
                .ifPresent(System.out::println);
        System.out.println("\n======================");
        employees.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::salary)))
                .ifPresent(System.out::println);

        System.out.println("\n=============================");
        System.out.println("name for each department");
        employees.stream()
                .collect(Collectors.groupingBy(Employee::department, Collectors.mapping(Employee::name, Collectors.toList())))
                .entrySet()
                .forEach(System.out::println);

    }
}
