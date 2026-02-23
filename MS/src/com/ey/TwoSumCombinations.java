package com.ey;

import java.util.*;

public class TwoSumCombinations {
    static void main() {
        int[] nums = {2,4,3,3,5,7};
        int target = 6;

        List<List<Integer>> result = findPairs(nums, target);
        System.out.println(result);
    }

    private static List<List<Integer>> findPairs(int[] nums, int target) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> unique = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        for(int num : nums){
            int complement = target-num;

            if(set1.contains(complement)){
                int a = Math.min(num, complement);
                int b = Math.max(num, complement);
                String key = a + "," + b;
                if (!unique.contains(key)) {
                    result.add(Arrays.asList(a, b));
                   // unique.add(key);
                }
            }
            set1.add(num);
        }
        return result;
    }
}
