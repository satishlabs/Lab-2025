package com.cba;

import java.util.*;
import java.util.stream.Collectors;

/*
Map<Integer,String> map = new HashMap<>();
map.put(1, "Alice");
map.put(2, "Bob");
map.put(3,"Alice");
map.put(4,"charlie");
map.put(5,"Bob");
o/p:{1=Alice, 2=Bob, 4=charlie}
* */
public class RemoveDuplicateInMap {
    static void main() {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3,"Alice");
        map.put(4,"charlie");
        map.put(5,"Bob");

        LinkedHashMap<Integer, String> collect = map.entrySet()
                .stream()
                .filter(entry -> map.entrySet()
                        .stream()
                        .filter(e -> e.getValue().equals(entry.getValue()))
                        .findFirst()
                        .get()
                        .getKey()
                        .equals(entry.getKey())
                )
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a, LinkedHashMap::new
                ));

        System.out.println(collect);
        System.out.println("\n=======================");
        Set<String> set = new HashSet<>();
        Map<Integer,String> result = map.entrySet()
                .stream()
                .filter(e -> set.add(e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a,b) ->a,
                        LinkedHashMap::new
                ));
        System.out.println(result);
    }
}
