package com.ltmindtree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighest {
    static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 25, 8, 40, 25, 40, 15);
        numbers.stream()
                .distinct()
                .sorted(Comparator.comparingInt(Integer::intValue).reversed())
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("\n============================");
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : numbers){
            if(num > first){
                second = first;
                first = num;
            }else if(num > second && num != first){
                second = num;
            }
        }
        System.out.println("Second Highest: "+second);
    }
}
