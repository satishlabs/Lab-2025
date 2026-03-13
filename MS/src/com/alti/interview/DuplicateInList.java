package com.alti.interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

//input : "AA","BB","CC","AA"
//ouput : AA=2, BB=1, CC=1
public class DuplicateInList {
    static void main(String[] args) {
        List<String> list = Arrays.asList("AA","BB","CC","AA");
        list.stream()
                .collect(Collectors.groupingBy(word ->word, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);
    }
}
