package com.epam;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public record Employee(int id, String name, double salary) {

    static void main() {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Rahul", 70000),
                new Employee(2, "Amit", 90000),
                new Employee(3, "Neha", 70000),
                new Employee(4, "Pooja", 90000),
                new Employee(5, "Ankit", 70000)
        );

        //Sort by Salary(ASC) -> then name (ASC)
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::salary).thenComparing(Employee::name))
                .forEach(System.out::println);

        System.out.println("\n==========================");
        //Sort by Salary(DESC) -> then name (ASC)
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::salary).reversed().thenComparing(Employee::name))
                .forEach(System.out::println);

        System.out.println("\n==========================");
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                int salary = Double.compare(e1.salary,e2.salary);
                if(salary == 0){
                    return e1.name.compareTo(e2.name);
                }
                return salary;
            }
        });
    }
}
