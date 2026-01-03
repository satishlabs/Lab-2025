package com.mphasis;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondHighestNumber {
    static void main() {
        int[] arr = {10,15,9,20,17};
        Integer secondMax = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                        .orElseThrow();
        System.out.println(secondMax);

        System.out.println("\n##############################");
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > first){
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;

            }
        }
        System.out.println(first+" : "+second);
    }
}
