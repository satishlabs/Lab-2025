package com.jdk8.stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class FindMaximumOccurringCharacter {
    static void main() {
        String str = "aabbbccccdddddddeee";
        Optional<Map.Entry<Character, Long>> max = str.chars()
                .mapToObj(c -> (char) c)
                .collect(groupingBy(Function.identity(), counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparingLong(e -> e.getValue()));
        System.out.println(max);
    }
}
