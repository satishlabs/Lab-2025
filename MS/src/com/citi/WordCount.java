package com.citi;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {
    static void main() {
        String statement = "Hello world hello Java hello world Java Java";
        String[] words = statement.toLowerCase().split("\\s+");
        Map<String, Long> wordsCount = Arrays.stream(words)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        wordsCount.forEach((word, count)->{
            System.out.println(STR."\{word} \{count}");
        });

    }
}
