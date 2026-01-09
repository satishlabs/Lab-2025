package com.alti.arr;

public class SubarraySumIndex {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        indexOfSubArraySum(arr, target);
    }

    private static void indexOfSubArraySum(int[] arr, int target) {
        int left = 0;
        int sum = 0;
       for(int i=0; i<arr.length; i++){
           sum += arr[i];
           while(sum > target && left <= i){
               sum -= arr[left];
               left++;
           }

           if(sum == target){
               System.out.println(left+" and "+i);
               return;
           }
       }
        System.out.println("No Subarray found");
    }
}
