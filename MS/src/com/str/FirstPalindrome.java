package com.str;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstPalindrome {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "level", "world", "radar");
        String palindromeNotFound = words.stream()
                .filter(w -> new StringBuilder(w).reverse().toString().equals(w)).findFirst().orElse("Palindrome not found");
        System.out.println("\nFirst Palindrome: =>"+palindromeNotFound);
        List<String> collect = words.stream().filter(w -> new StringBuilder(w).reverse().toString().equals(w)).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
