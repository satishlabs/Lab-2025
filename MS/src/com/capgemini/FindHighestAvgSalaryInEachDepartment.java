package com.capgemini;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindHighestAvgSalaryInEachDepartment {
    static void main() {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "AA",23,"HR","Male",5000.0),
        new Employee(2, "BB",23,"IT","Female",9000.0),
                new Employee(3, "CC",23,"HR","Male",8000.0),
                new Employee(4, "DD",23,"CS","Female",12000.0)
        );

        Map.Entry<String, Double> collect = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);
        System.out.println(collect);
    }
}
