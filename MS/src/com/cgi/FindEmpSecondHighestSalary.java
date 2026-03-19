package com.cgi;

import java.util.Comparator;
import java.util.List;

public class FindEmpSecondHighestSalary {
    static void main() {
        List<Employee> employeeList = List.of(
                new Employee(1,"Suraj",200000,"HR"),
                new Employee(2,"Prakash",150000,"IT"),
                new Employee(3,"Satish",350000,"CS"),
                new Employee(4,"Manish",250000,"IT")
        );

        employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::salary))
                .skip(2)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
