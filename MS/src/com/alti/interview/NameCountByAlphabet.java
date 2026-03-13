package com.alti.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameCountByAlphabet {
    static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Satish",
                "Suresh",
                "Ravi",
                "Rahul",
                "Amit",
                "Ankit",
                "John"
        );
        names.stream()
                .collect(Collectors.groupingBy(name ->name.charAt(0), Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);

        System.out.println("\n=======================");
        names.stream()
                .collect(Collectors.groupingBy(
                        s -> s.charAt(0),
                        Collectors.counting()))
                .forEach((k,v) -> System.out.println(k + " : " + v));
    }
}
