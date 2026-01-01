package com.str;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentChar {
    static void main() {
        String str = "Satish";
        mostFrequentChar(str);;
    }

    private static void mostFrequentChar(String str) {
        Map.Entry<Character,Long> result = str.toLowerCase().chars()
                .mapToObj(c ->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        System.out.println(result.getKey()+" : "+result.getValue());
    }


}
