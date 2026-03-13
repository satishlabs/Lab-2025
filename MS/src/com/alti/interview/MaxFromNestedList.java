package com.alti.interview;

import java.util.Arrays;
import java.util.List;

public class MaxFromNestedList {
    static void main(String[] args) {
        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1, 5, 3),
                Arrays.asList(10, 2, 8),
                Arrays.asList(6, 7, 4)
        );

        numbers.stream()
                .flatMap(List::stream)
                .max(Integer::compareTo)
                .ifPresent(System.out::println);
    }
}
