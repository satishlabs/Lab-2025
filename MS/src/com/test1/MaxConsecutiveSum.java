package com.test1;

public class MaxConsecutiveSum {
    static void main() {
        int[] arr = {1,2,3,4,5};
        int b=3;
        System.out.println(maxSum(arr,b));
    }

    private static int maxSum(int[] arr, int b) {
        int windowSum = 0;

        //first window
        for(int i=0; i<b; i++){
            windowSum += arr[i];
        }
        int maxSum = windowSum;
        for(int i=b; i<arr.length; i++){
            windowSum = windowSum-arr[i-b]+arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}
