package com.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWordFrequency {
    static void main() {
        String str = "Hello! how are you, where are you going?";
       Map<String, Integer> map  = new HashMap<>();
        for(String word: str.toLowerCase().split("\\s+")){
            map.put(word, map.getOrDefault(word,0)+1);
        }
        map.forEach((k,v) ->{
            System.out.println(k+" "+v);
        });

        System.out.println("\n================");

        Arrays.stream(str.split("\\s+"))
                .collect(Collectors.groupingBy(w->w,Collectors.counting()))
                .forEach((k,v) -> System.out.println(k+" : "+v));
        System.out.println("\n=====================");
        Arrays.stream(str.split("[a-zA-Z0-9]]+"))
                .filter(w -> !w.isEmpty())
                .collect(Collectors.groupingBy(String::toLowerCase, LinkedHashMap::new,Collectors.counting()))
                .forEach((k,v) -> System.out.println(k+" = "+v));
    }
}
