package com.map;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRecurringChar {
    public static void main(String[] args) {
        String str = "bananas";
        Map<Character, Long> collectChar = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Optional<Map.Entry<Character, Long>> maxChar = collectChar.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        maxChar.ifPresent(e ->
                System.out.println(e.getKey()+" Count: "+e.getValue()));

    }
}
