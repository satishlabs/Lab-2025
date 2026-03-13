package com.alti.interview;

import java.util.Arrays;
import java.util.List;

public class FindMaxAndMin {
    static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7, 3);
        System.out.println("\n=====With-Stream=============");
        numbers.stream()
                .max(Integer::compareTo)
                .ifPresent(System.out::println);
        numbers.stream()
                .min(Integer::compareTo)
                .ifPresent(System.out::println);
        System.out.println("\n=====Without-Stream=============");
        int min = numbers.get(0);
        int max = numbers.get(0);
        for(int num : numbers){
            if(num <min){
                min = num;
            }

            if(num > max){
                max = num;
            }
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
    }
}
