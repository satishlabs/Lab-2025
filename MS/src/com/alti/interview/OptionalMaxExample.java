package com.alti.interview;

import java.util.*;
import java.util.function.Predicate;

public class OptionalMaxExample {
    static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 20, 30);
        List<Integer> list2 = Arrays.asList(15, 25, 35);
        Optional.ofNullable(Math.max(Collections.max(list1), Collections.max(list2))).ifPresent(System.out::println);
        System.out.println("\n=============");
        Optional.ofNullable(Math.max(Collections.max(list1),Collections.max(list2))).ifPresent(System.out::println);

        System.out.println("\n=============");
        Predicate<Integer> isOdd = n ->n%2 != 0;
        System.out.println(isOdd.test(6));
        System.out.println("\n=============");
    }
}
