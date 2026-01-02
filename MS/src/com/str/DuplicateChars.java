package com.str;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateChars {
    static void main() {
        String input = "programming";
        input.chars()
                .mapToObj(c ->(char)c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(c ->c.getValue()>1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

        System.out.println("\n=================");
        Set<Character> set = new HashSet<>();
        input.chars()
                .mapToObj(c ->(char)c)
                .filter(c ->!set.add(c))
                .forEach(System.out::println);

        System.out.println("\n=================");

        input.chars()
                .mapToObj(c ->(char)c)
                .collect(Collectors.groupingBy(c ->c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e ->e.getValue()>1)
                .forEach(e -> System.out.println(e.getKey()+" = "+e.getValue()));
    }
}
