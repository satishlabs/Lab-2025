package com.alti.arr;

public class MaxSubArray {
    static void main() {
       // int[] arr = {1,4,7,-2,4,7,-3,9};
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; //6
        System.out.println(maxSubArray(arr));
    }

    private static int maxSubArray(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];
        for(int i=1; i<arr.length; i++){
            currentSum = Math.max(arr[i], currentSum+arr[i]);
            maxSum  = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

}
