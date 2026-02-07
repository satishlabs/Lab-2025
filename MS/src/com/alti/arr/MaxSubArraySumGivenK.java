package com.alti.arr;
/*
Find Max Sub array sum
arra[] ={1,2,3,4,5}
 subArray=3
  6, 9, 12

     //12
* */
public class MaxSubArraySumGivenK {
    static void main() {
       int arr[] = {1,2,3,4,5};
        int k=3;
        System.out.println(maxSubArraySum(arr, k));
    }

    private static int maxSubArraySum(int[] arr, int k) {
        int left = 0;
        int n = arr.length;
        int sum = 0;
        int maxSum =0;
        for(int i=0; i<k; i++){
            sum += arr[i]; //6
        }
        maxSum = sum;
        for(int i=k; i<n; i++){
            sum += arr[i];
            sum -=arr[i-k];
            maxSum = Math.max(maxSum, sum);
        }


        return maxSum;
    }
}
