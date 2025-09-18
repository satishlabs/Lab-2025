package com.arr;

import java.util.HashSet;

public class PrintSumTwoConsecutiveNumbers {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8};

        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        System.out.println(set);
        for(int i=0; i<arr.length-1; i++){
            int a = arr[i];
            int b = arr[i+1];
            int sum = a+b;
            if(set.contains(sum)){
                System.out.println(a+" "+b+ ", "+sum);
            }
        }
    }
}
