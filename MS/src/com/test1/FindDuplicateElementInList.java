package com.test1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindDuplicateElementInList {
    static void main() {
        List<Integer> list = Arrays.asList(1,5,3,6,8,9,5,2, 8, 3);
        list.stream()
                .collect(Collectors.groupingBy(l->l, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e ->e.getValue() >1)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("\n======================================");
        list.stream()
                .distinct()
                .max(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);

        list.stream()
                .distinct()
                .min(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);
        System.out.println("\n===============================");
        System.out.println("Convert a List into a Map");
        list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);
        System.out.println("\n===============================");
        System.out.println("\nCalculate the sum and average of a list of numbers");
        System.out.println(IntStream.range(0, list.size())
                .sum());
        System.out.println(IntStream.range(0, list.size())
                .average());
        System.out.println("\n====================================");
        System.out.println("Find the frequency of each element in a list");
        list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);
        System.out.println("\n====================================");
        System.out.println("\nRemove duplicates from a list using Streams");
        list.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println("\n====================================");
        System.out.println("\nReverse a string using Stream operations");

        System.out.println("\n====================================");
        System.out.println("\n Reverse a string using Stream operations");

        System.out.println("\n====================================");
        System.out.println("\nFind the second highest number in a list");

        System.out.println("\n====================================");
        System.out.println("\nCheck if two strings are anagrams using Streams");

        System.out.println("\n====================================");
        System.out.println("\nGroup objects by a specific field (e.g., department)");

        System.out.println("\n====================================");
        System.out.println("\nPartition a list into even and odd numbers");

        System.out.println("\n====================================");
        System.out.println("\nFind the longest string in a list");

        System.out.println("\n====================================");
        System.out.println("\nCheck if all elements in a list match a condition");

        System.out.println("\n====================================");
        System.out.println("\nFind any / first element from a Stream");

        System.out.println("\n====================================");
        System.out.println("\nConvert a Stream back to a List or Set");

        System.out.println("\n====================================");
        System.out.println("\nJoin a list of strings using a delimiter");

        System.out.println("\n====================================");
        System.out.println("\nFlatten a list of lists using flatMap");

        System.out.println("\n====================================");
        System.out.println("\n Sort a list of objects based on a specific field");


    }
}
