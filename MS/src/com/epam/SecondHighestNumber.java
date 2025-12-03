package com.epam;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNumber {
    static void main() {

        int[] arr = {20, 15, 18, 29, 10, 17};
        Integer noSecondHighest = Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No Second Highest"));
        System.out.println(noSecondHighest);

        System.out.println("Second highest number is: " + findSecondHighest(arr));
    }

    private static int findSecondHighest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;

        for(int num : arr){
            if(num > first){
                second = first;
                first = num;
            }else if(num >second && num < first){
                second = num;
            }
        }
        return second;
    }
}
