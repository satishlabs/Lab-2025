package com.epam;

import java.util.Map;
import java.util.stream.Collectors;

public class MaxCharFrequency {
    static void main() {
        String words = "Satish Prasad";

        Map.Entry<Character, Long> characterLongEntry = words.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();
        System.out.println("Character with highest frequency: "+characterLongEntry.getKey());
        System.out.println("Frequency: "+characterLongEntry.getValue());
    }
}
