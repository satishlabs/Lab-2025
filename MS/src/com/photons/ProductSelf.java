package com.photons;

import java.util.Arrays;
/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
Example 1: Input: nums = [1,2,3,4] Output: [24,12,8,6]
Example 2: Input: nums = [-1,1,0,-3,3] Output: [0,0,9,0,0]

* */
public class ProductSelf {
    static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productSelf(arr)));
    }

    private static int[] productSelf(int[] arr) {
        int n= arr.length;
        int[] result = new int[n]; //[1,1,2,6]
        result[0] = 1;
        for(int i=1; i<n; i++){
            result[i] = result[i-1]*arr[i-1];
        }
        int suffix = 1;
        for(int i=n; i>=0; i--){
            result[i] = result[i]*suffix;
            suffix *= arr[i];
        }
        return result;
    }
}
