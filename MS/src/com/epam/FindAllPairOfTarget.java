package com.epam;

import java.util.Arrays;

public class FindAllPairOfTarget {
    static void main() {
        int[] arr  = {4,7,8,3,5,6,9,2};
        int target = 11;

        findPair(arr, target);
    }

    private static void findPair(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int sum  = arr[left]+arr[right];
            if(sum == target){
                System.out.println( arr[left]+", "+arr[right]+" : "+target);
                left++;
                right--;
            } else if (sum < target) {
                left++;

            }else{
                right--;
            }
        }
    }
}
