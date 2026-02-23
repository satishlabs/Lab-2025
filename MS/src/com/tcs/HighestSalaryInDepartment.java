package com.tcs;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HighestSalaryInDepartment {
    static void main(String[] args) {
        List<Emp> empList = List.of(
                new Emp(1, "Satish","HR", 50000),
                new Emp(2, "Rakesh","CS", 30000),
                new Emp(3, "Prakash","HR", 20000),
                new Emp(4, "Kumar","CS", 70000),
                new Emp(5, "Kundan","IT", 25000)
        );

        empList.stream()
                .collect(Collectors.groupingBy(Emp::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Emp::getSalary))))
                .entrySet()
                .forEach(System.out::println);
    }
}
