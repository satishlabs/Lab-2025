package com.alti.map;

import java.util.*;
import java.util.stream.Collectors;

public class MapLab1 {
    static void main() {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Banana");
        map.put(2, "Apple");
        map.put(3, "Mango");

        //Sort values, maintained the order
      Map<Integer, String> mapObj =  map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
              .collect(Collectors.toMap(
                      Map.Entry::getKey,
                      Map.Entry::getValue,
                      (e1, e2) ->e1,
                      LinkedHashMap::new
              ));
        System.out.println(mapObj);
        System.out.println("\n========================");
        //Sort by the key
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        System.out.println("\n=======================");
        //Sort by value
        List<String> list = new ArrayList<>();
        for(Map.Entry e: map.entrySet()){
            list.add((String) e.getValue());
        }
        System.out.println(list);
        list.stream().sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }
}
