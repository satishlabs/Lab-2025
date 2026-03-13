package com.alti.interview;

import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateCharacter {
    static void main(String[] args) {
        String str = "programming";
        char[] charArr = str.toCharArray();
        str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e ->e.getValue()>=2)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
