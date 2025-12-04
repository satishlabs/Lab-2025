package com.blackhawk;

public class LongestSubArray {
    static void main() {
        int[] arr = {1,1,0,1};
        int maxLen = longestSubArray(arr);
        System.out.println(maxLen);
    }

    private static int longestSubArray(int[] arr) {
        int left = 0; //Left pointer of the window.
        int maxLen = 0; //Maximum length of contiguous 1s after removing one 0.
        int zeroCount = 0; //Number of 0s in the current window.
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                zeroCount++;
            }
            // If there are more than one zero, move left pointer
            while(zeroCount > 1){
                if(arr[left] == 0){
                    zeroCount--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, i-left);
        }
        return maxLen;
    }
}
