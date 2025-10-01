package com.jdk8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "stream", "api", "java", "code", "Test1");
        String collect = names.stream()
                .distinct()
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(2)
                .collect(Collectors.joining(", "));
        System.out.println(collect);
    }
}
