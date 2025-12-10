package com.jdk8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindKthLargestElementInArray {
    static void main() {
        int[] arr = {1, 12, 44, 32, 52, 81, 59, 84, 72, 37};
        int k=4;
        System.out.println(findKthElements(arr, k));
    }

    private static int findKthElements(int[] arr, int k) {
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        return  list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(k-1)
                .findFirst()
                .orElse(-1);
    }
}
