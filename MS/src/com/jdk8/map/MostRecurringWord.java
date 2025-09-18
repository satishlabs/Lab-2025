package com.jdk8.map;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRecurringWord {
    public static void main(String[] args) {
        String sentence = "hello world hello java world hello";
        Map<String, Long> collect = Arrays.stream(sentence.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Optional<Map.Entry<String, Long>> maxRepeated = collect.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        System.out.println("word counts: "+collect);
        System.out.println("Most repeated word: "+maxRepeated.map(Map.Entry::getKey).orElse("None"));

    }
}
