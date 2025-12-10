package com.jdk8.stream;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    static void main() {
        String str = "satish";
        Optional<Character> first = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst();

        System.out.println(first.orElse(null));

        System.out.println("\n====================");
        Map<Character, Integer> map = new HashMap<>();
        for(Character c: str.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
       for(Map.Entry<Character, Integer> entry : map.entrySet()){
           if(entry.getValue() == 1){
               System.out.println(entry.getKey());
               return;
           }
       }

        System.out.println("\n====================");
        Optional<Character> first1 = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
                .findFirst();
        System.out.println(first1.orElse(null));

    }
}
