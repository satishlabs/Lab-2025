package com.arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DivisibleBy2And3 {
    static void main() {
        int arr[] = {2,4,6,9,12,18};
        List<Integer> list = new ArrayList<>();
       for(int i=0; i<arr.length; i++){
           if(arr[i]%2==0 && arr[i]%3 == 0){
               list.add(arr[i]);
           }
       }
        System.out.println(list);
        System.out.println("\n======================");

        Arrays.stream(arr)
                .filter( n -> n%2==0 && n%3 ==0)
                .forEach(System.out::println);
    }
}
