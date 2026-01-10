package com.hexaware;

import java.util.*;
import java.util.stream.Collectors;

public class FindNonRepeatedChar {
    static void main(String[] args) {
        String str = "Satish";

       str.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .forEach((k,v) -> System.out.println(k+ " "+v));

        System.out.println("\n========================");
        Map<Character, Integer> map = new HashMap<>();
        for(Character c: str.toLowerCase().toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
        System.out.println("\n==========================");
    str.toUpperCase()
            .chars()
            .mapToObj(c ->(char)c)
            .collect(Collectors.groupingBy(c ->c, LinkedHashMap::new, Collectors.counting()))
            .entrySet()
            .stream()
            .filter(e ->e.getValue() == 1)
            .map(Map.Entry::getKey)
            .forEach(System.out::println);
    }
}
