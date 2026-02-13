package com.alti.arr;

import java.util.Arrays;
import java.util.Comparator;

public class FindKthLargestElement {
    static void main(String[] args) {
        int[] arr = {2,5,8,12,8,15, 17};
        int k = 3;

        Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
