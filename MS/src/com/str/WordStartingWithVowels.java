package com.str;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordStartingWithVowels {
    static void main() {
        List<String> words = Arrays.asList(
                "Apple", "Banana", "orange", "Umbrella",
                "car", "Eagle", "ink", "Sky", "owl"
        );

        List<String> collect = words.stream()
                .filter(w -> !w.isEmpty())
                .filter(w -> "aeiouAEIOU".indexOf(w.charAt(0)) != -1)
                .collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("\n==========================");
        String sentence = "An elephant is eating an orange under a tree";
        List<String> collect1 = Arrays.stream(sentence.split("\\s+"))
                .filter(word -> word.matches("(?i)^[aeiou].*"))
                .collect(Collectors.toList());
        System.out.println(collect1);
    }
}
