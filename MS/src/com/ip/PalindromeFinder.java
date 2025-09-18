package com.ip;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PalindromeFinder {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "level", "world", "radar");

        // Find the first palindrome
        Optional<String> first = words.stream()
                .filter(PalindromeFinder::isPalindrome)
                .findFirst();

        List<String> findAll= words.stream()
                .filter(PalindromeFinder::isPalindrome)
                .collect(Collectors.toList());
        System.out.println("First Palindrome: "+first.orElse("None"));
        System.out.println("All Palindrome : "+findAll);
    }

    private static boolean isPalindrome(String words) {
        return words.equalsIgnoreCase(new StringBuilder(words).reverse().toString());
    }
}
