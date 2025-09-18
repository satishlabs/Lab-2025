package com.arr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Stream;

public class DuplicateElementsinArray {
    public static void main(String[] args) {
        int[] arr = {1,5,3,6,7,9,4,5, 6,1,1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);
        map.forEach((k, v) ->{
            if(v>1){
                System.out.println(k+" repeated at "+v+" times");
            }
        });

        System.out.println("\n==========================");
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for(int num : arr){
            if(!set.add(num)){ //if already present - duplicates
                duplicates.add(num);
            }
        }
        System.out.println("Duplicates elements: "+duplicates);
    }
}
