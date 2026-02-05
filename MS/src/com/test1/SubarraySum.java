package com.test1;

public class SubarraySum {
    static void main() {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int sum = 33;
        findSubarrayWithGivenSum(arr, sum);
    }
    /*
    Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
 *Ouptut: Sum found between indexes 2 and 4

    * */
    private static void findSubarrayWithGivenSum(int[] arr, int sum) {
        int start=0;
        int result = 0;
        for(int i=0; i<arr.length; i++){
            // Add the current element to the current sum
            result += arr[i];

            // If current sum exceeds the target, remove elements from the start
            while(result > sum & start <= i){
                result -= arr[start];
                start++;
            }

            // Check if the current sum matches the target
            if(result == sum){
                System.out.println("sum found between indxex: "+start+" and "+i);
                return;
            }
        }
        System.out.println("No subarray with the given sum found.");
    }
}

