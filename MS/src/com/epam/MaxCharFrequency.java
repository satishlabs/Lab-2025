package com.epam;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxCharFrequency {
    static void main() {
        String words = "Satish Prasad";

        Map.Entry<Character, Long> characterLongEntry = words.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();
        System.out.println("Character with highest frequency: "+characterLongEntry.getKey());
        System.out.println("Frequency: "+characterLongEntry.getValue());

        System.out.println("\n============================");
        Map<Character, Integer> map = new HashMap<>();
        for(Character c : words.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        //map.forEach((k,v) -> System.out.println(k+" "+v));
        System.out.println("\n Approach 1: Simple Loop");
        char maxChar = 0;
        int maxCount = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println("Max Key: "+maxChar+" max value: "+maxCount);

        System.out.println("\n Approach 2: Using Stream API");
        Map.Entry<Character, Integer> result = map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);
        System.out.println("Max Frequency Character : "+result.getKey());
        System.out.println("Frequency :"+ result.getValue());

        System.out.println("\n Approach 3: Using Collections.max()");
        int max = Collections.max(map.values());
        char maxChar1 = 0;
        for(char c: map.keySet()){
            if(map.get(c) == max){
                maxChar1 = c;
                break;
            }
        }
        System.out.println("Max Frequency Character: "+ maxChar1);
    }
}
