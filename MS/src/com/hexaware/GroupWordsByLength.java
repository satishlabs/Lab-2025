package com.hexaware;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Using Java 8, group words by their length
Example:
["java", "spring", "boot", "api"]
Output:
{3=[api], 4=[java, boot], 6=[spring]}
* */
public class GroupWordsByLength {
    static void main() {
        List<String> word = Arrays.asList("java", "spring", "boot", "api");
      Map<Integer, List<String>> result = word.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(result);
    }
}
/**
 How it works
 words.stream() → creates stream
 String::length → key mapper (grouping criteria)
 Collectors.groupingBy(...) → groups elements into a Map<Integer, List<String>>
 */
