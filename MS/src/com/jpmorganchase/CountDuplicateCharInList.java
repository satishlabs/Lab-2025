package com.jpmorganchase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicateCharInList {
    static void main(String[] args) {
        List<String> list = List.of("a","b","c","d","a","d","a");
        Map<String, Long> collect = list.stream()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        collect.forEach((k,v)-> System.out.println(k+" : "+v));
    }
}
