package com.map;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRecurringWord {
    public static void main(String[] args) {
        String str = "hello world hello java java hello";
        String[] words = str.split("\\s+");
        Map<String, Long> wordsMap = Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Optional<Map.Entry<String, Long>> maxWords = wordsMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        maxWords.ifPresent( e -> System.out.println("Most recurring word = "+e.getKey()+" Count= "+e.getValue()));
    }
}
