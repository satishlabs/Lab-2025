package com.alti.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueElement {
    static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> list2 = Arrays.asList(3,5,7,9);

        List<Integer> result = list1.stream()
                .filter(e ->!list2.contains(e))
                .collect(Collectors.toList());
        result.addAll(list2.stream()
                .filter(e ->!list1.contains(e))
                .collect(Collectors.toList()));
        System.out.println(result);

        System.out.println("\n==============================");
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        Set<Integer> result1 = new HashSet<>(set1);
        result1.addAll(set2);

        System.out.println(result1);
    }
}
