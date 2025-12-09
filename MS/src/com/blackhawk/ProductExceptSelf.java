package com.blackhawk;

public class ProductExceptSelf {
    static void main() {
        int[] nums = {1,2,3,4};
       int[] answer =  productExceptSelf(nums);
       for(int i=0; i<answer.length; i++){
           System.out.println(answer[i]);
       }
    }

    private static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        answer[0] = 1;
        for(int i=1; i<nums.length; i++){
            answer[i] = answer[i-1]*nums[i-1];
        }

        int suffix = 1;
        for(int i = nums.length-1; i>=0; i--){
            answer[i] = answer[i]*suffix;
            suffix*=nums[i];
        }
        return answer;
    }
}
