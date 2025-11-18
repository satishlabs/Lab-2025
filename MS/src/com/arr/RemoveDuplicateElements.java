package com.arr;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {5,2,6,1,2,5};
        int[] unique = findUnique(arr);
        for(int num : unique){
            System.out.print(num+" ");
        }
    }

    private static int[] findUnique(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        int[] result = new int[set.size()];
        int i=0;
        for(int num: set){
            result[i++] = num;
        }
        return result;
    }
}
