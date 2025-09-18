package com.arr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinValueExmple {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,3,45,-7,22,0);

        //1.
        int min = Collections.min(numbers);
        System.out.println("Minimum value : "+min);
        System.out.println("\n===================");
        min = Integer.MAX_VALUE;
        for(int num : numbers){
            if(num < min){
                min = num;
            }
        }
        System.out.println("Min element: "+min);

        System.out.println("\n===================");
        min = numbers.stream()
                .min(Integer::compareTo)
                .orElseThrow(() -> new RuntimeException("List is empty"));
        System.out.println("Min Element: "+min);

    }
}
