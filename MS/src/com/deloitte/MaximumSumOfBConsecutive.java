package com.deloitte;

public class MaximumSumOfBConsecutive {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k=3;
        System.out.println(maxOfConsecutiveK(arr,k));
    }

    private static int maxOfConsecutiveK(int[] arr, int k) {
        int windowSum = 0;
        int maxSum =0;
        for(int i=0; i<k; i++){
            windowSum += arr[i];
        }

        maxSum = windowSum;

        for(int i=k; i<arr.length; i++){
            windowSum += arr[i];
            windowSum -= arr[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

}
