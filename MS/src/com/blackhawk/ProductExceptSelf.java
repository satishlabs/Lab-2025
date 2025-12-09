package com.blackhawk;

import java.util.Arrays;

public class ProductExceptSelf {
    static void main() {
        int[] nums = {1,2,3,4};
       int[] answer =  productExceptSelf(nums);

      for(int n: answer){
          System.out.println(n);
      }

        System.out.println("\n======================");
        int[] answer1 =  productExceptSelf1(nums);
        for(int n: answer1){
            System.out.println(n);
        }
    }

    private static int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] res = new int[n];

        prefix[0] = 1;
        for(int i=1; i<n; i++){
            prefix[i] = nums[i-1]*prefix[i-1];
        }

        suffix[n-1] = 1;
        for(int j = n-2; j>=0; j--){
            suffix[j] = nums[j+1]*suffix[j+1];
        }

        for(int i=0; i<n; i++){
            res[i] = prefix[i]*suffix[i];
        }
        return res;
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
