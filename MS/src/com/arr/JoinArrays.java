package com.arr;

import java.util.Arrays;
import java.util.stream.Stream;

public class JoinArrays {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4,5};
        Integer[] arr2 = {3,4,5,6,7};
        Integer[] result = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .distinct()
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(result));

    }
}
