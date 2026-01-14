package com.mphasis;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumK {
    static void main() {
        System.out.println(countSubarrays(
                new int[]{9, 4, 20, 3, 10, 5}, 33)); // 2

        System.out.println(countSubarrays(
                new int[]{10, 2, -2, -20, 10}, -10)); // 3

        System.out.println(countSubarrays(
                new int[]{1, -1, 1, -1, 1}, 0)); // 6

    }

    private static int countSubarrays(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  // base case

        int prefixSum = 0;
        int count = 0;

        for (int num : arr) {
            prefixSum += num;

            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
