package com.deloitte;

import com.capgemini.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HighestSalaryInDepartment {
    static void main() {
        List<com.capgemini.Employee> employeeList = Arrays.asList(
                new com.capgemini.Employee(1, "AA",23,"HR","Male",5000.0),
                new com.capgemini.Employee(2, "BB",23,"IT","Female",9000.0),
                new com.capgemini.Employee(3, "CC",23,"HR","Male",8000.0),
                new Employee(4, "DD",23,"CS","Female",12000.0)
        );

        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))))
                .entrySet()
                .stream()
                .forEach(System.out::println);

        System.out.println("\n=====================");
       employeeList.stream()
               .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
               .skip(1)
               .findFirst()
               .ifPresent(System.out::println);
    }
}
