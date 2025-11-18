package com.arr;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};
        Set<Integer> commonElements = findCommonElements(arr1, arr2);
        System.out.println("Common Elements: "+commonElements);
    }

    private static Set<Integer> findCommonElements(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commonElements = new HashSet<>();
        for(int num: arr1){
            set1.add(num);
        }
        for(int num: arr2){
            if(set1.contains(num)){
                commonElements.add(num);
            }
        }
        return commonElements;
    }
}
