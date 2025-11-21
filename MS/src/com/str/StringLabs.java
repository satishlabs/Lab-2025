package com.str;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringLabs {
    public static void main(String[] args) {
        System.out.println("\n 1. Reverse a String");
        String str = "hello";
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println(reverse);

        System.out.println("\n 2. Check if String is Palindrome");
        String s = "madam";
        boolean isPal = s.contentEquals(new StringBuilder(s).reverse());
        System.out.println(isPal);

        System.out.println("\n 3. Count vowels and consonants");
         s = "hello world".toLowerCase();
        long vowels = s.chars().filter(ch -> "aeiou".indexOf(ch) != -1).count();
        long constants = s.chars().filter(Character::isLetter)
                .filter(ch -> "aeiou".indexOf(ch) == -1).count();
        System.out.println("Vowels: "+vowels+" Constants: "+constants);

        System.out.println("\n 4. Count characters frequency");
        Map<Character, Long> freq = str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(freq);

        System.out.println("\n 5. Remove duplicate characters");
        String unique = str.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println(unique);

        System.out.println("\n 6. Find first non-repeating character");
        Character firstNonRepeated = "test".chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().orElse(null);
        System.out.println(firstNonRepeated);

        System.out.println("\n 7. Check if two strings are anagrams");
        boolean checkStringAnagrams = Arrays.equals("madam".chars().sorted().toArray(), "madam".chars().sorted().toArray());
        System.out.println(checkStringAnagrams);

        System.out.println("\n 8. Reverse each word in a sentence");
        String reverseEachWord = Arrays.stream("Hello World".split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(reverseEachWord);
        String sentence = "Hello World Satish";
        System.out.println("\n 9. Find longest word in a sentence");
        String s1 = Arrays.stream(sentence.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println(s1);

        System.out.println("\n 10. Count number of words");
       long word = Arrays.stream(sentence.trim().split("\\s+")).count();
        System.out.println(word);

        System.out.println("\n 11. Remove all whitespaces");
        System.out.println(sentence.replaceAll("\\s", ""));

        System.out.println("\n 12. Remove all special characters");
        System.out.println("Hello World".replaceAll("[^0-9A-Za-z]]", ""));

        System.out.println("\n 13. Capitalize first letter of each word");
        String result = Arrays.stream("hello Satish how are you".split(" "))
                .map(w ->w.substring(0,1).toUpperCase()+w.substring(1))
                .collect(Collectors.joining(" "));
        System.out.println(result);

        System.out.println("\n 14. Check if string contains only digits");
        System.out.println("satish011".matches("\\d+"));
    }
}
