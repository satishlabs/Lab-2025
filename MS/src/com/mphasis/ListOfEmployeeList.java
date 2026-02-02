package com.mphasis;

import java.util.*;
import java.util.stream.Collectors;

public class ListOfEmployeeList {
    static void main() {
        //                new Employee(1, "Satish","Male",40, 900000, "IT"),
       //IT Department
        List<Employee> itEmployees = Arrays.asList(
                new Employee(1, "Satish","Male",40, 75000,"IT"),
                new Employee(2, "Ravi", "Male", 39,82000,"IT")
        );

        //MAINT Department
        List<Employee> maintEmployees = Arrays.asList(
                new Employee(3,"Anil","Male",40, 60000,"Maint"),
                new Employee(4, "Kiran", "FeMale", 39,65000,"Maint")
        );

        //ADMIN Department
        List<Employee> adminEmployees = Arrays.asList(
                new Employee(5,"Suma","FeMale",40, 60000,"ADMIN"),
                new Employee(6, "Kiran", "FeMale", 39,65000,"ADMIN")
        );


        //SECURITY Department
        List<Employee> secEmployees = Arrays.asList(
                new Employee(7,"Ramesh","Male",40, 50000,"SECURITY"),
                new Employee(8, "Mahesh", "Male", 39,52000,"SECURITY")
        );

        List<List<Employee>> empList = Arrays.asList(
                itEmployees, maintEmployees, adminEmployees, secEmployees
        );

        System.out.println(empList);
        System.out.println("\n========================");
        empList.stream()
                .flatMap(List::stream)
                        .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get)))
                .entrySet()
                .forEach(System.out::println);
    }
}
