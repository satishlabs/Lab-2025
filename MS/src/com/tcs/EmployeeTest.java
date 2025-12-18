package com.tcs;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {
    static void main() {
        List<Employee> empList = List.of(
                new PermanentEmployee(1, "Satish", 2000000),
                new ContractualEmployee(2, "Amit", 150000),
                new PermanentEmployee(3, "Ravi", 170000),
                new ContractualEmployee(4, "Neha", 45500)
        );

        empList.stream()
                .filter(e -> e instanceof ContractualEmployee)
                .map(e -> (ContractualEmployee)e)
                .collect(Collectors.toList()).forEach(e -> System.out.println(e.getName()+" "+e.getHourlyRate()));
    }
}
