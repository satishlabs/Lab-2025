package com.capgemini;

import java.util.Arrays;

public class SortArray {
    static void main() {
        int[] arr = {3,2};
        int[] arr1 = Arrays.stream(arr)
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(arr1));
    }
}
