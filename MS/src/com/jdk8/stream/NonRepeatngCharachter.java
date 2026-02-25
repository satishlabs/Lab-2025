package com.jdk8.stream;

import java.util.stream.Collectors;

public class NonRepeatngCharachter {
    static void main(String[] args) {
        "India".toLowerCase().chars()
                .mapToObj(c ->(char)c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e ->e.getValue()==1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
