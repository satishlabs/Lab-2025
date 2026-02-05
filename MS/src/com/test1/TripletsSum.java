package com.test1;

import java.util.Arrays;

public class TripletsSum {
    static void main() {
        int[] arr = new int[]{ 0, -1, 2, -3, 1,3,-2 };
        int sum=0;
        findTripletSum(arr,sum);
    }

    private static void findTripletSum(int[] arr, int sum) {
        Arrays.sort(arr);
        for(int i=0; i< arr.length; i++){
            int left = i+1;
            int right = arr.length-1;
            int x = arr[i];

            while (left < right){
                if(x+arr[left]+arr[right] == sum){
                    System.out.println(x+", "+arr[left]+", "+arr[right]);
                    left++;
                    right--;
                }else if(x+arr[left]+arr[right] < sum){
                    left++;
                }else{
                    right--;
                }
            }
        }
    }
}
