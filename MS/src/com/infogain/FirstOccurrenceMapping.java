package com.infogain;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
First Occurrence Mapping
Input:
 ["apple", "ant", "banana", "ball", "bat", "umbrella", "orange", "owl"]
Output:
{ a=apple, b=banana, u=umbrella, o=orange }
* */
public class FirstOccurrenceMapping {
    static void main() {
        List<String> list = Arrays.asList( "apple", "ant", "banana", "ball",
                "bat", "umbrella", "orange", "owl");

        Map<Character, String> collect = list.stream()
                .collect(Collectors.toMap(
                        word -> word.charAt(0), //Key Mapper
                        word -> word, //Value Mapper
                        (existing, replacement) -> existing, // keep first
                        LinkedHashMap::new          // maintain order
                ));
        System.out.println(collect);
    }
}
