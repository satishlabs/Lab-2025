package com.jdk8.map;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRecurringChar {
    public static void main(String[] args) {
        String input = "programming";
        Map<Character, Long> countRepeated = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Optional<Map.Entry<Character, Long>> maxRepated = countRepeated.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        System.out.println("char counts: "+countRepeated);
        System.out.println(" Most repeated count: "+maxRepated.map(Map.Entry::getKey).orElse(null));
    }
}
