package com.dsa.arr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TwoSum {
    static void main() {
        int [] arr = {2,5,7,3,6,9};
        int target = 9;
        System.out.println(Arrays.toString(findTwoSum(arr, target)));
        System.out.println("\n===========================");
        System.out.println(containsDplicate(arr));
    }



    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    private static boolean containsDplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int n: arr){
            if(!set.add(n))
                return true;
        }
        return false;
    }
}
