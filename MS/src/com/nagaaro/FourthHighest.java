package com.nagaaro;

import java.util.*;
import java.util.stream.Collectors;

public class FourthHighest {
    static void main(String[] args) {
        int []arr = {1,1,2,2,2,2,1,1,3,34,5,5,6,6,7,87,8,9,7,4,5,677,7,77,12,4};
        Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(n->n, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e ->e.getValue() == 1)
                .map(Map.Entry::getKey)
                .sorted(Comparator.reverseOrder())
                .skip(3)
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("\n==================================");
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        List<Integer> uniqueList = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                uniqueList.add(entry.getKey());
            }
        }

        uniqueList.sort(Collections.reverseOrder());
        if(uniqueList.size() >= 4){
            System.out.println(uniqueList.get(3));
        }
    }
}
