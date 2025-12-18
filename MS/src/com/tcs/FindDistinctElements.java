package com.tcs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDistinctElements {
    static void main() {
        int[] arr = {1,2,3,1,2,3,4,5};
       int[] distinctArr = Arrays.stream(arr)
                .distinct()
                .toArray();
        for(int num: distinctArr){
            System.out.println(num);
        }
        System.out.println("\n =========================");
        List<String> names = Arrays.asList("apple", "banana", "apple", "orange");
        names.stream()
                .distinct()
                .collect(Collectors.toList()).forEach(System.out::println);
    }

}
