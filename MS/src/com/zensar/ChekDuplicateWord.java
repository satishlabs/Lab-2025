package com.zensar;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ChekDuplicateWord {
    static void main() {
        String str = "Test Java With Java 8";
        Map<String, Long> collect = Arrays.stream(str.split("\\s+"))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        if(collect.isEmpty()){
            System.out.println("No duplicate found");
        }else{
            System.out.println("Duplicate found:" +collect);
        }
    }
}
