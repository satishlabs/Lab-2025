package com.alti.arr;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MaxFromTwoLists {
    static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 20, 30);
        List<Integer> list2 = Arrays.asList(5, 25, 35);

        Stream.concat(list1.stream(), list2.stream())
                .max(Integer::compareTo)
                .ifPresent(System.out::println);

        System.out.println("\n===========================");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        Predicate<Integer> isEven = n->n%2 == 0;
        numbers.stream()
                .filter(isEven)
                .forEach(System.out::println);

        System.out.println("\n========================");
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        set1.removeAll(list2);
        set2.removeAll(list1);

        set1.addAll(set2);

        System.out.println(set1);

    }
}
