package com.tcs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lab2 {
    static void main() {
        Set<String> set = new HashSet<>();
        set.add("abc");
        set.add(new String("abc"));
        System.out.println(set.size());

        System.out.println("\n============================");
        List<List<String>> list = List.of(
                List.of("eat","tae","tea"),
                List.of("tan","nat"),
                List.of("tan","tee")
        );

        List<List<String>> collect = list.stream()
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(str -> {
                    char[] arr = str.toCharArray();
                    Arrays.sort(arr);
                    return new String(arr);
                }))
                .values()
                .stream()
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}
