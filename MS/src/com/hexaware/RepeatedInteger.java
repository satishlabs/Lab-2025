package com.hexaware;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedInteger {
    static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,1,2,3,4,5,3);
        Map<Integer, Long> collect = list.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        collect.forEach((k,v) -> System.out.println(k+" "+v));

        System.out.println("\n====================");
        Integer i1 = list.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println(i1);

    }
}
