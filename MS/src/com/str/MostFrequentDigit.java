package com.str;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentDigit {
    static void main() {
        String str = "a1b222c33";

        Map.Entry<Integer, Long> result = str.chars()
                .filter(Character::isDigit)
                .map(c ->c-'0')
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        System.out.println(result.getKey()+" : "+result.getValue());
    }
}
