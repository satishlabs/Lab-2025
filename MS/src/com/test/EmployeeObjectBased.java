package com.test;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeObjectBased {
    static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"AAA",25, "Male", 20000, "IT"),
                new Employee(2,"BBB",30, "Female", 25000, "CS"),
                new Employee(3,"CCC",20, "Male", 15000, "HR"),
                new Employee(4,"DDD",35, "Female", 18000, "CS"),
                new Employee(5,"EEE",40, "Male", 12000, "IT"),
                new Employee(6,"FFF",27, "Male", 30000, "IT")
        );

       //1️⃣ Group employees by department
        System.out.println("\uFE0F⃣ Group employees by department");
        Map<String, List<Employee>> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::department));
        collect.forEach((k,v) -> System.out.println(k+" "+v));
        System.out.println("\n============================");

        //2️⃣ Highest salary employee
        System.out.println(" 2. Highest salary employee");
        Optional<Employee> max = employees.stream()
                .max(Comparator.comparingDouble(Employee::salary));
        System.out.println(max);
        System.out.println("\n============================");

        //3️⃣ Average salary per department
        System.out.println("3. Average salary per department");


        System.out.println("\n============================");
        //4️⃣ Sort employees by salary + name
        System.out.println("4. Sort employees by salary + name");
            employees
                    .stream()
                    .sorted(Comparator.comparingDouble(Employee::salary).thenComparing(Employee::name))
                    .forEach(System.out::println);
        System.out.println("\n============================");
        //5️⃣ Salary greater than X
        System.out.println("5. Salary greater than X");
        employees.stream()
                .filter(e ->e.salary() > 15000)
                .forEach(System.out::println);
        System.out.println("\n============================");
        //6️⃣ Youngest / Oldest employee
        System.out.println("6. Youngest / Oldest employee");
         Optional<Employee> youngest = employees.stream()
                .min(Comparator.comparingInt(Employee::age));
         youngest.ifPresent(e -> System.out.println(STR."Youngest: \{e}"));
         Optional<Employee> oldest  = employees.stream()
                 .max(Comparator.comparingInt(Employee::age));
         oldest.ifPresent(e -> System.out.println(STR."Oldest: \{e}"));
        System.out.println("\n============================");
        //7️⃣ Count employees per department
        System.out.println("7. Count employees per department");
        Map<String, Long> collect1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::department, Collectors.counting()));
        collect1.forEach((k,v) -> System.out.println(k+" : "+v));
        System.out.println("\n============================");
        //8️⃣ Department with max employees
        System.out.println("8. Department with max employees");
       Optional<Map.Entry<String, Long>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::department, Collectors.counting()))
                .entrySet()
                .stream()
                        .max(Map.Entry.comparingByValue());
       map.ifPresent(e -> System.out.println("Department with max ems => "+e.getKey()+" : "+e.getValue()));
        System.out.println("\n============================");
        //9️⃣ Second highest salary employee
        System.out.println("9. Second highest salary employee");
        Optional<Employee> secondHighest  = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::salary).reversed())
                        .skip(1)
                                .findFirst();
        secondHighest.ifPresent(System.out::println);
        secondHighest = employees.stream()
                        .collect(Collectors.groupingBy(Employee::salary))
                                .entrySet()
                                        .stream()
                .sorted(Map.Entry.<Double, List<Employee>>comparingByKey().reversed())
                                                        .skip(1)
                                                                .map(e ->e.getValue().get(0))
                                                                        .findFirst();
        secondHighest.ifPresent(System.out::println);
        System.out.println("\n============================");
        //10 List → Map (id, name)
        System.out.println("10. List → Map (id, name)");
      employees.stream()
                      .collect(Collectors.toMap(Employee::id, Employee::name))
                              .forEach((k,v) -> System.out.println(k+" : "+v));

        System.out.println("\n============================");
        //11 Count By Department and Gender
        System.out.println("11. Count By Department and Gender");
        Map<String,Map<String,Long>> result = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::department, Collectors.groupingBy(Employee::gender,Collectors.counting())));
        System.out.println(result);
    }
}
