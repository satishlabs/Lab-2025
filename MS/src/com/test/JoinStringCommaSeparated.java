package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringCommaSeparated {
    static void main() {
        List<String> list = Arrays.asList("Java", "Spring", "Docker", "Kubernetes");
        String collect = list.stream()
                .collect(Collectors.joining(", "));
        System.out.println(collect);
        /*
        stream() → converts list to stream
Collectors.joining(", ")
Joins elements
Adds , between each element
Returns a single String
        * */
        System.out.println("\n============================");
        String[] arr = {"A", "B", "C"};
        String result = String.join(",", arr);
        System.out.println(result);
    }
}
