package com.dsa.arr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllMissingNumber {
    static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8};
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        System.out.println(set);
        for(int i=1; i<=9; i++){

            if(!set.contains(i)){
                result.add(i);

            }
           // result.add(i);
        }
        System.out.println(result);

        System.out.println("\n=================");
        int[] arr1 = {2,3,4,5,6,7,8};
        System.out.println(findDisappearedNumbers(arr1));
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0)
                nums[index] = -nums[index];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                result.add(i + 1);
        }
        return result;
    }
}
