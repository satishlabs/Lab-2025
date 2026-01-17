package com.test;

import java.util.Arrays;

public class PrintOddEvenNum {
    static void main() {
        int[] arr = {2,5,6,7};
        int oDD = Integer.MIN_VALUE;
        int eVEN = Integer.MIN_VALUE;

        for(int num : arr){
            if(num%2 == 0){
                System.out.println(num +" Even");
            }else{
                System.out.println(num +" Odd");
            }
        }
        System.out.println("\n==========================");
        int[] array = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .toArray();
        System.out.println(Arrays.toString(array));
    }
}
