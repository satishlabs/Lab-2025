package com.alti.dates;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class EmployeMain {
    static void main() {
        EmployeeStoreDOB store = new EmployeeStoreDOB();


        store.addEmployee(new Employee(1, "Satish", LocalDate.of(1995, 5, 10)));
        store.addEmployee(new Employee(2, "Rahul", LocalDate.of(1998, 8, 20)));
        store.addEmployee(new Employee(3, "Anita", LocalDate.of(1996, 2, 15)));
        store.addEmployee(new Employee(4, "Vikram", LocalDate.of(1998, 8, 20)));

        List<Employee> result = store.getEmployeesBetween(
                LocalDate.of(1995, 1, 1),
                LocalDate.of(1997, 12, 31)
        );

        result.forEach(System.out::println);

        System.out.println("\n=================================");

        List<Employee> employeeList = List.of(
                new Employee(1, "Satish", LocalDate.of(1995, 5, 10)),
                new Employee(2, "Rahul", LocalDate.of(1998, 8, 20)),
                new Employee(3, "Anita", LocalDate.of(1996, 2, 15)),
                new Employee(4, "Vikram", LocalDate.of(1998, 8, 20))
        );

        LocalDate today = LocalDate.now();
        for(Employee emp : employeeList){
            Period period = Period.between(emp.dob, today);
            System.out.println(emp.name + " Age: " +
                    period.getYears() + " years, " +
                    period.getMonths() + " months, " +
                    period.getDays() + " days");
        }
    }
}
