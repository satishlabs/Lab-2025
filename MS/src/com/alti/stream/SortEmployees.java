package com.alti.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployees {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"Satish", 50000,"HR"),
                new Employee(2,"Amit", 40000,"IT"),
                new Employee(3,"John", 40000,"HR"),
                new Employee(4,"Neha", 60000,"CS"),
                new Employee(5,"Balu", 50000,"HR")
        );

        List<Employee> sortedList = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName))
                .toList();
        System.out.println("Sorted Emps");
        sortedList.forEach(System.out::println);

        System.out.println("\n===================================");
        //use stream api, find the emp belong to hr, find the sal for all hr depet
        System.out.println(employeeList.stream()
                //.filter(emp -> emp.getDepartment().equalsIgnoreCase("HR"))
                        .filter(emp ->"HR".equalsIgnoreCase(emp.getDepartment()))
                .mapToDouble(Employee::getSalary)
                .sum());
    }
}
