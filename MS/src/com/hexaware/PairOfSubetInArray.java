package com.hexaware;

import java.util.Arrays;

public class PairOfSubetInArray {
    static void main() {
        int[] arr = {4, 5, 7, 11, 9, 13, 8, 12};
        int sum = 20;

       findPairs(arr, sum);
    }

    private static void findPairs(int[] arr, int sum) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            if(arr[left]+arr[right] == sum){
                System.out.println(arr[left]+", "+arr[right] +" = "+sum);
                left++;
                right--;
            }else if(sum > arr[left]+arr[right]){
                left++;
            }else{
                right--;
            }
        }
    }
}
