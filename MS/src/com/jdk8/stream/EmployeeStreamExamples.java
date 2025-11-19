package com.jdk8.stream;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStreamExamples {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
               new Employee(1,"Satish", 50000.0, "HR"),
                new Employee(2, "Prasad", 70000.0, "IT"),
                new Employee(3,"Kumar", 30000.0, "HR"),
                new Employee(4, "Amir", 35000.0, "IT"),
                new Employee(5,"Kapil", 90000.0, "CS"),
                new Employee(6, "Manish", 50000.0, "EC"),
                new Employee(7, "Kundan", 40000.0, "HR")

        );

        System.out.println("1. Group employees by department");
        Map<String, List<Employee>> empGroupByDepart = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        empGroupByDepart.forEach((depart,empList) -> System.out.println(depart+" "+empList));

        System.out.println("\n 2. Count number of employees in each department.");
        Map<String, Long> noOfEmpInEachDepart = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        noOfEmpInEachDepart.forEach((k,v) -> System.out.println(k+" "+v));

        System.out.println("\n 3. Find highest salary employee in each department.");
        Map<String, Optional<Employee>> findHighestSalaryInDepart = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        findHighestSalaryInDepart.forEach((k,v) -> System.out.println(k+" "+v));

        System.out.println("\n 4. Group by department and calculate average salary");
        Map<String, Double> findAvgSalaryByDepart = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        findAvgSalaryByDepart.forEach((k,v) -> System.out.println(k+" "+v));

        System.out.println("\n 5. Filter employees with salary > 50,000 and map only names");
        List<String> empListSalary = employeeList.stream()
                .filter(e -> e.getSalary() >= 50000)
                .map(Employee::getName)
                .toList();
        System.out.println(empListSalary);

        System.out.println("\n 6. Create Map<Dept, List<EmployeeName>>\n" +
                "Convert employee objects into names grouped by department.");
        Map<String, List<String>> empObjectGrByDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        empObjectGrByDepartment.forEach((k,v) -> System.out.println(k+" "+v));

        System.out.println("\n 7. Get department → total salary");
        Map<String, Double> findTotalSalary = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
        findTotalSalary.forEach((k,v) -> System.out.println(k+" "+v));

        System.out.println("\n 8. Partition employees into two groups (salary ≥ 50k and < 50k)");
        Map<Boolean, List<Employee>> partitionEmpInTwoGroups = employeeList.stream().collect(Collectors.partitioningBy(e -> e.getSalary() >= 50000));
        partitionEmpInTwoGroups.forEach((k,v) -> System.out.println(k+" "+v));

        System.out.println("\n 9. Group by department and sort employees by salary (descending)");
        Map<String, List<Employee>> groupByDepartmentSortEmpSalary = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(Collectors.toList(), list -> list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                        .collect(Collectors.toList()))));
        groupByDepartmentSortEmpSalary.forEach((k,v) -> System.out.println(k+" "+v));

        System.out.println("\n 10. Get all unique departments");
        Set<String> uniqueDepartment = employeeList.stream()
                .map(Employee::getDepartment)
                .collect(Collectors.toSet());
        System.out.println(uniqueDepartment);

        System.out.println("\n 11. Find second highest salary");
        Optional<Double> findSecondHighestSalary = employeeList.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        findSecondHighestSalary.ifPresent(salary ->
                System.out.println("Second highest salary = " + salary)
        );
        System.out.println("\n 12. Convert List<Employee> to Map<id, name>");
        Map<Integer, String> map = employeeList.stream()
                .collect(Collectors.toMap(Employee::getId, Employee::getName));
        map.forEach((k,v) -> System.out.println(k+" "+v));
    }
}
