package com.alti;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
/*
Find the first and all palindrome string in a list using Java 8 Streams.
List<String> words = Arrays.asList("hello", "level", "world", "radar");
* */

public class PalindromeWithStreams {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "level", "World", "radar");

        //1. Find all palindrome
        List<String> palindrome = words.stream()
                .filter(PalindromeWithStreams::isPalindrome)
                .toList();
        System.out.println("All Palindrome: "+palindrome);

        //2. Find first palindrome
       Optional<String> firstPalindrome = words.stream()
                .filter(PalindromeWithStreams::isPalindromes)
                .findFirst();
        System.out.println("\n First Palindrome: "+firstPalindrome);

    }

    private static boolean isPalindromes(String word) {
        int left = 0;
        int right = word.length()-1;
        while(left < right){
            if(word.charAt(left++) != word.charAt(right--)){
                return false;
            }
        }
        return true;
    }

    // Palindrome check helper
    private static boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }
}
