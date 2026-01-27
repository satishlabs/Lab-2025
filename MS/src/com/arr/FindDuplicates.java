package com.arr;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicates {
    static void main() {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};
        Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(n ->n, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e ->e.getValue() >1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
        System.out.println("\n================");
        Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(n->n, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(n ->n.getValue() >1)
                .forEach(System.out::println);
    }
}
