package com.alti.interview;

import java.util.Arrays;

public class CalculateWordOccurence {
    static void main(String[] args) {
        String str = "Hello, How are you?";
        String[] words = str.split( " ");
        for(String word: words){
            System.out.println(word);
        }
        System.out.println("\n=================");
        Arrays.stream(words)
                .forEach(System.out::println);
        System.out.println("\n=================");

    }
}
