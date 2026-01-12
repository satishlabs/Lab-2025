package com.test;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeBySalary {
    static void main() {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"AAA",20, "Male", 20000, "IT"),
                new Employee(2,"BBB",20, "Female", 25000, "CS"),
                new Employee(3,"CCC",20, "Male", 15000, "IT")
        );

        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::salary))
                .forEach(System.out::println);
        /**
         How it works (Step-by-Step)
         employees.stream() → converts list into a stream
         Comparator.comparingDouble(Employee::salary)
         Extracts the salary from each employee
         Compares salaries as double
         sorted() → sorts in ascending order
         forEach() → prints each employee
         */

        System.out.println("\n====================");
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::salary).reversed())
                .forEach(System.out::println);

        System.out.println("\n====================");
        employees.stream()
                .sorted((e1,e2) ->Double.compare(e2.salary(),e1.salary()))
                .forEach(System.out::println);
        System.out.println("\n===========================");
        Comparator<Employee> salaryComparator = Comparator.comparing(Employee::salary);
        employees.stream().sorted(salaryComparator).forEach(System.out::println);
        System.out.println("\n===========================");
        employees.stream().sorted(salaryComparator.reversed()).forEach(System.out::println);
    }
}
