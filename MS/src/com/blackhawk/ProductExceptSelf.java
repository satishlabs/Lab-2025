package com.blackhawk;

import java.util.Arrays;

public class ProductExceptSelf {
    static void main() {
        int[] nums = {1,2,3,4};
       int[] answer =  productExceptSelf(nums);
      for(int n: answer){
          System.out.println(n);
      }
    }

    private static int[] productExceptSelf(int[] nums) {
      int n = nums.length;
      int[] res = new int[n];
       Arrays.fill(res,1);
      for(int i=0; i<n; i++){
          for(int j=0; j<n; j++){
              if(i != j){
                  res[i]*=nums[j];
              }
          }
      }
      return res;
    }
}
