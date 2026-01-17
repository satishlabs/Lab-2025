package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharOccurrenceString {
    static void main() {
        String str  ="satish";
        List<Character> list = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(list);
    }
}
