package com.alti.interview;

import java.util.Comparator;
import java.util.List;

public class FIndMinValueInList {
    static void main(String[] args) {
        List<Integer> list = List.of(1,3,8,4,6,7);
        list.stream()
                .min(Comparator.comparing(Integer::intValue))
                .ifPresent(System.out::println);
        System.out.println("\n===========================");
        list.stream()
                .max(Comparator.comparing(Integer::intValue))
                .ifPresent(System.out::println);
    }
}
