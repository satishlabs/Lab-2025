package com.arr;

public class FindMaxSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = findMaxSubArraySum(arr);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    private static int findMaxSubArraySum(int[] arr) {
        int max = arr[0];
        int currentSum = arr[0];
        for(int i=0; i<arr.length; i++){
            currentSum = Math.max(arr[i], currentSum+arr[i]);

            max = Math.max(max, currentSum);
        }
        return  max;
    }
}
