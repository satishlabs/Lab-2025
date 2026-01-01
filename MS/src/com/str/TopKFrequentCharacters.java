package com.str;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class TopKFrequentCharacters {
    static void main() {
        String input = "programming";
        int k = 2;
        List<Character> result = input.chars()
                .mapToObj(c ->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Character,Long>comparingByValue().reversed())
                .limit(k)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(result);
    }
}
