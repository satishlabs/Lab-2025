package com.alti.interview;

import java.util.Arrays;

public class MoveZeroEndAndStart {
    static void main() {
        int[] arr = {1,0,0,1};
        moveZeroStart(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("\n==================");
        int[] arr1 = {1,0,0,1};
        moveZeroEnd(arr1);
        System.out.println(Arrays.toString(arr1));

    }

    private static void moveZeroEnd(int[] arr1) {
        int right = arr1.length-1;
        for(int i=arr1.length-1; i>=0; i--){
            if(arr1[i] ==0){
                int temp = arr1[right];
                arr1[right] = arr1[i];
                arr1[i] = temp;
                right--;
            }
        }
    }

    private static void moveZeroStart(int[] arr) {
        int left = 0;
        for(int i=1; i<arr.length; i++){ //[1,0,0,1]
            if(arr[i] == 0){ //i=2
                int temp = arr[left]; //0
                arr[left] = arr[i];//
                arr[i] = temp;
                left++;
            }
        }
    }
}
