package com.test1;

public class TwoSumProblem {
    static void main() {
       int[] nums = {2, 7, 11, 15};
        int target = 9;
        twoSum(nums, target);
    }

    private static void twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int sum = nums[left]+nums[right];
            if(sum == target){
                System.out.println(nums[left]+", "+nums[right]);
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
