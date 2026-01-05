package com.zensar;

import java.util.Arrays;

public class FindTargetSum {
    static void main() {
        int[] arr = {12, 3, 4, 1, 6, 9};
        int target = 24;

        findTargetSum(arr, target);
    }

    private static void findTargetSum(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            int x = arr[i];
            int left = i+1;
            int right = n-1;
            while(left < right){
                int sum = arr[i]+ arr[left]+arr[right];
                if(sum == target){
                    System.out.println(arr[i]+", "+arr[left]+", "+arr[right]+" = "+sum);
                    left++;
                    right--;
                }else if(sum < target){
                    left++;
                }else{
                    right--;
                }
            }

    }
    }
}
