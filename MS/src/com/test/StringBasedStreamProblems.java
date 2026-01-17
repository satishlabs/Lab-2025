package com.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringBasedStreamProblems {
    static void main(String[] args) {
       //1. First non-repeated character
        System.out.println("\n 1. First non-repeated character");
     Character first = "Satish".toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                        .orElse(null);

        System.out.println(first);
        System.out.println("\n=================================");

        //2.First repeated character
        System.out.println("\n 2.First repeated character");
    Character secondRepeated =   "satihs".chars()
                .mapToObj(c ->(char)c)
                .collect(Collectors.groupingBy(c ->c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(c ->c.getValue()>=1)
                .map(Map.Entry::getKey)
                .findFirst()
            .orElse(null);
        System.out.println(secondRepeated);
        System.out.println("\n=================================");
        System.out.println("\n 3.  ⃣All non-repeated characters");
        Stream<Character> characterStream = "satihs".chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(c -> c.getValue() == 1)
                .map(Map.Entry::getKey);
        System.out.println(characterStream.toList());
        System.out.println("\n=================================");
        System.out.println("\n 4. Character frequency count");

        //4. Character frequency count
        //5. Anagram check
        //6. Reverse each word in a sentence
        //7. Longest word from string
        //8. Remove duplicate characters
        //9. Sort characters alphabetically
        //10. Count vowels & consonants
    }
}
