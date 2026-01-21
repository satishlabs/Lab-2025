package com.test;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayBasedStream {
    static void main(String[] args) {
        int[] arr = {1,3,5,6,2,4,5,2};
        //1. find duplicate elements in an array
        System.out.println("1. find duplicate elements in an array");
       Arrays.stream(arr)
               .boxed()
                .collect(Collectors.groupingBy(n ->n, Collectors.counting()))
               .entrySet()
               .stream()
               .filter(e ->e.getValue() >1)
               .map(Map.Entry::getKey)
               .forEach(System.out::println);
        System.out.println("\n===========================================");

    }
}
