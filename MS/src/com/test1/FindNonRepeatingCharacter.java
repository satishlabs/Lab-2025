package com.test1;

import java.util.stream.Collectors;

public class FindNonRepeatingCharacter {
    static void main() {
        "swiss".chars()
                .mapToObj(c ->(char)c)
                .collect(Collectors.groupingBy(c ->c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e ->e.getValue()==1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
