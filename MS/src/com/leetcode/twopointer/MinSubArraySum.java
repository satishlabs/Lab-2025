package com.leetcode.twopointer;

public class MinSubArraySum {
    static void main() {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;

       int result = minSubArrayLen(arr, target);
        System.out.println(result);
    }

    private static int minSubArrayLen(int[] arr, int target) {
        int left =0;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i]; //expand window
            while(sum >= target){
                minLen = Math.min(minLen, i-left+1);
                sum -= arr[left];
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

}
