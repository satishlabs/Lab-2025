package com.mphasis;

import java.util.*;
import java.util.stream.Collectors;

public class FindHighestSalaryInEmp {
    static void main() {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Satish","Male",40, 900000, "IT"),
                new Employee(2, "Prasad","Male",35,1000000,"CS"),
                new Employee(3,"Kumar1","Female",30,450000,"IT")
        );
    //Write Java 8 Stream code to group employees by department and find the highest salary per department.
        Map<String, Optional<Employee>> collect = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
                collect.forEach((k,v)-> System.out.println(k+" "+v));

        //Find the Employee , who is having highest salary
        Optional<Employee> max = employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(max);
    }
}
