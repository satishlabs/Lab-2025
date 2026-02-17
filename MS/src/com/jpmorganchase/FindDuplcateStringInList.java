package com.jpmorganchase;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplcateStringInList {
    static void main(String[] args) {
        List<String> strList = Arrays.asList("Satish","Hello","World","hello","Satish");
        strList.stream()
                .collect(Collectors.groupingBy(w->w.toLowerCase(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e ->e.getValue()>1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

        System.out.println("\n=============================");
        Set<String> set = new HashSet<>();
        Set<String> result = new HashSet<>();
        for(String word : strList){
            if(!set.add(word.toLowerCase())){
                result.add(word);
            }
        }
        System.out.println(result);

        System.out.println("\n========================");
        Set<String> duplicates =
                strList.stream()
                        .filter(s -> Collections.frequency(strList, s) > 1)
                        .collect(Collectors.toSet());
        System.out.println(duplicates);
    }
}
