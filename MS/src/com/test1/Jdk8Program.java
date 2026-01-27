package com.test1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Jdk8Program {
    static void main() {
        List<Integer> list = Arrays.asList(10, 5,  20, 8, 25, 20);

        Integer i = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println(i);
        System.out.println("\n===========================");
        System.out.println("Count Character Occurrences in a String");

       "Satish".toLowerCase().chars()
               .mapToObj(c -> (char)c)
               .collect(Collectors.groupingBy(ch ->ch, Collectors.counting()))
               .forEach((k,v)-> System.out.println(k+" "+v));

        System.out.println("\n===========================");
        System.out.println("Find Duplicate Elements in a List");
        list = Arrays.asList(1,2,3,4,2,5,1,6, 4);
        List<Integer> finalList = list;
       Set<Integer> set =  list.stream()
                .filter(n ->Collections.frequency(finalList, n) >1)
                .collect(Collectors.toSet());
        System.out.println(set);

        System.out.println("Better (Performance-friendly)");
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = list.stream()
                .filter(n -> !seen.add(n))
                .collect(Collectors.toSet());
        System.out.println(duplicates);
        System.out.println("\n===========================");
        System.out.println("Group Objects by a Field");
    }
}
