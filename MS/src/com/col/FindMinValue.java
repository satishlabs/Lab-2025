package com.col;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMinValue {
    static void main() {
        List<Integer> list = Arrays.asList(10, 5, 8, 2, 15);
        int min = list.stream()
                .min(Integer::compareTo)
                .get();
        System.out.println("Min1:"+min);

        System.out.println("\n=================");

        min = list.stream()
                .mapToInt(Integer::intValue)
                .min()
                .getAsInt();
        System.out.println("Min2:"+min);

        System.out.println("\n=================");
        min = Integer.MAX_VALUE;
        for(int num : list){
            if(num < min){
                min = num;
            }
        }
        System.out.println("Min3:"+min);

        System.out.println("\n=================");
        min = Collections.min(list);

        System.out.println("Min4:"+min);

        System.out.println("\n=================");
    }
}
