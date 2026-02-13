package com.alti.arr;

import java.util.List;

public class MinAndMax {
    static void main(String[] args) {
        List<Integer> list = List.of(3,4,1,7,15, 9, 12);
        list.stream()
                .distinct()
                .min(Integer::compareTo)
                .ifPresent(System.out::println);
        System.out.println("\n==================");
        list.stream()
                .distinct()
                .max(Integer::compareTo)
                .ifPresent(System.out::println);
    }
}
