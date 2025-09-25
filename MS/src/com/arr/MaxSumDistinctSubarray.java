package com.arr;

import java.util.HashSet;

public class MaxSumDistinctSubarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5};
        int k = 3;

        int maxSum = maxSumDistinctSubarray(arr, k);
        System.out.println(maxSum);
    }
    /*
    Subarrays of size 3:
    {1, 2, 3} → sum = 6 (distinct) ✅
    {2, 3, 2} → sum = 7 (not distinct) ❌
    {3, 2, 5} → sum = 10 (distinct) ✅
    * */
    private static int maxSumDistinctSubarray(int[] arr, int k) {
        int n = arr.length;
        int maxSum=0;
        for(int i=0; i<=n-k; i++){
            HashSet<Integer> set = new HashSet<>();
            int sum=0;
            boolean distinct = true;
            for(int j=i; j<i+k; j++){
                if(set.contains(arr[j])){
                    distinct = false;
                    break;
                }
                set.add(arr[j]);
                sum+=arr[j];
            }
            if(distinct){
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}
