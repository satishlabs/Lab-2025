package com.epam;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    static void main() {
        String str = "satish";


        System.out.println("\n=======================");
        Optional<Character> first = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e ->e.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst();
        System.out.println(first.orElse(null));

        System.out.println("\n============================");
        Map<Character, Integer> map = new HashMap<>();
        for(Character c: str.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(Character c: str.toCharArray()){
            if(map.get(c) == 1){
                System.out.println("First Non-repeated character: "+c);
                return;
            }
        }
    }
}
