package com.alti.arr;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateChars {
    static void main() {
        String str ="programming";
        str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e ->e.getValue()>1)
                .forEach(e -> System.out.println(e.getKey()+" "+e.getValue()));

        System.out.println("\n======================");
        str.chars()
                .mapToObj(c ->(char)c)
                .filter(c -> Collections.frequency(
                        str.chars().mapToObj(ch -> (char)ch).collect(Collectors.toList()), c) > 1)
                .distinct()
                .forEach(System.out::println);
        System.out.println("\n=================");

        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        str.chars()
                .mapToObj(c ->(char)c)
                .forEach(c ->{
                    if(!seen.add(c)){
                        duplicates.add(c);
                    }
                });
        duplicates.forEach(System.out::println);

        System.out.println("\n =================");
        str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() >1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

        System.out.println("\n=================");
        Map<Character, Integer> map = new HashMap<>();
        for(char c: str.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        map.forEach((k,v) ->{
            if(v >1){
                System.out.println(k+" "+v);
            }
        });
    }
}
