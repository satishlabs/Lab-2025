package com.arr;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int subArray = 3;
        int maxSum = maxSumArray(arr, subArray);
        System.out.println(maxSum);
    }
/*
Subarrays of size 3:
{1, 2, 3} → sum = 6 (distinct) ✅
{2, 3, 2} → sum = 7 (not distinct) ❌
{3, 2, 5} → sum = 10 (distinct) ✅
* */
    private static int maxSumArray(int[] arr, int subArray) {
        int n = arr.length;
        int sum=0;
        for(int i=0; i<subArray; i++){
            sum+=arr[i];
        }

        int maxSum = sum;
        for(int i=subArray; i<n; i++){
            sum+=arr[i]-arr[i-subArray];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
