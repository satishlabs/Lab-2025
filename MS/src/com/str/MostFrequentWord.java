package com.str;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentWord {
    static void main() {
        String input = "java is easy and java is powerful";
         Map.Entry<String,Long> result = Arrays.stream(input.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        System.out.println(result.getKey()+" : "+result.getValue());
    }
}
