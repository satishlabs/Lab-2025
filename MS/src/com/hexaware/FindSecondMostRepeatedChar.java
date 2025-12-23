package com.hexaware;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
/*
1Find the 2nd most repeated character in a string
Example:
"aaaabbccbdd" → b
* */
public class FindSecondMostRepeatedChar {
    static void main() {
        String str  = "aaaabbccbdd";
        Character result = str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                .skip(1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println(result);
    }
}
