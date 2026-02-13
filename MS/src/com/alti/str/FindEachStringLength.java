package com.alti.str;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEachStringLength {
    static void main(String[] args) {
        List<String> list = Arrays.asList("Satish", "Prasad","Hello","World");
        list
                .stream()
                .collect(Collectors.groupingBy(s ->s.length()))
                .entrySet()
                .forEach(System.out::println);

        System.out.println("\n=====================");
        list.stream()
                .collect(Collectors.toMap(str ->str,str ->str.length()))
                .entrySet()
                .forEach(System.out::println);
    }
}
