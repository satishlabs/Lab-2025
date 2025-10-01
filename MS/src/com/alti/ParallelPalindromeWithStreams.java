package com.alti;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ParallelPalindromeWithStreams {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "level", "world", "radar", "madam", "java");
        List<String> palindromes = words.parallelStream()
                .filter(ParallelPalindromeWithStreams::isPalindrome)
                .toList();
        //1. Find all the palindrome
        System.out.println("All Palindrome: "+palindromes);

        // First palindrome (order not guaranteed in parallel streams unless we use findFirst with ordered stream)
       Optional<String> firstPalindrome = words.parallelStream()
                .filter(ParallelPalindromeWithStreams::isPalindrome)
                .findFirst();// might not be truly "first" in parallel
        System.out.println("\n First Palindrome(parallel): "+firstPalindrome.orElse("None"));

        //If order is important → use .sequential() after parallel
        firstPalindrome =  words.parallelStream()
                .filter(ParallelPalindromeWithStreams::isPalindrome)
                .sequential() //ensure order
                .findFirst();
        System.out.println("\n First Palindrome(ordered): "+firstPalindrome.orElse("None"));

    }

    private static boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }
}
