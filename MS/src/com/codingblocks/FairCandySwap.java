package com.codingblocks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {
    static void main(String[] args) {
        int[] arr = {4,3,4,5};
        int[] arr1 = {4,3,1,6};
        System.out.println(Arrays.toString(findFairCandySwap(arr,arr1)));
    }

    private static int[] findFairCandySwap(int[] arr, int[] arr1) {
        int sumA=0;
        int sumB=0;
        for(int a: arr)
            sumA += a;

        for(int b: arr1)
            sumB +=b;

        int diff = (sumA-sumB)/2;

        Set<Integer> setB = new HashSet<>();
        for(int b: arr){
            setB.add(b);
        }

        for(int a: arr1){
           int b = a-diff;
           if(setB.contains(b)){
               return new int[]{a,b};
           }
        }

        return new int[0];
    }
}
