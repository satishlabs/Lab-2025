package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateInList {
    static void main() {
        List<Integer> list = List.of(1,2,3,1,2,3,4,5);
        list.stream()
                .distinct()
                .toList()
                .forEach(System.out::println);

        System.out.println("\n==================");
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(Integer num : list){
            if(set.add(num)){
                result.add(num);
            }
        }
        System.out.println(result);
    }
}
