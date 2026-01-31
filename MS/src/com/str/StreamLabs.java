package com.str;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamLabs {
    static void main() {
        //1. First Non-Repeated Character: Given a string, find the first character that does not repeat anywhere in the string.
        //If no such character exists, return null or an empty result.
        System.out.println("1. First Non-Repeated Character: Given a string, find the first character that does not repeat anywhere in the string.\n" +
                "If no such character exists, return null or an empty result.");
     Optional<Character> firstChar =   "swiss".chars()
                .mapToObj(c ->(char)c)
                .collect(Collectors.groupingBy(c ->c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e ->e.getValue() ==1)
             .map(Map.Entry::getKey)
                .findFirst();
        firstChar.ifPresent(System.out::println);
        System.out.println("\n====================");
        System.out.println("2. First Repeated Character: Given a string, find the first character that appears more than once based on the order of appearance.");
        "programming".chars()
                .mapToObj(c ->(char)c)
                .collect(Collectors.groupingBy(c ->c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e ->e.getValue() >1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println("\n====================");
        System.out.println("3. Character Frequency: Given a string, return the frequency of each character present in the string.");
        "banana".chars()
                .mapToObj(c ->(char)c)
                .collect(Collectors.groupingBy(c ->c, Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(System.out::println);
        System.out.println("\n====================");
        System.out.println("4. Anagram Check: Given two strings, check whether they are anagrams of each other. Ignore case and spaces.");
        System.out.println(checkIsAnagram("listen","silent"));
        System.out.println(checkIsAnagram1("Dormitory", "Dirty room"));
        System.out.println("\n====================");
        System.out.println("5. Reverse Each Word in a Sentence: Given a sentence, reverse each word individually while preserving the word order.");
        System.out.println(reverseTheSentence("Java streams are powerful"));
        String collect = Arrays.stream("Java streams are powerful".split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(collect);
        System.out.println("\n====================");
        System.out.println("6. Longest Word in a String: Given a sentence, find the longest word.\n" +
                " If multiple words have the same maximum length, return the first one.");
        System.out.println(getLongestString("Streams make Java expressive"));
        System.out.println("\n====================");
        System.out.println("7. Remove Duplicate Characters: Given a string, remove duplicate characters while preserving the original order.");
        String collect1 = "programming".chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println(collect1);
        System.out.println("\n====================");
        System.out.println("8. Count Vowels and Consonants: Given a string, count the number of vowels and consonants. Ignore spaces and non-alphabetic characters.\n");
        String input = "Hello World".toLowerCase();
        long vowels =input.chars()
                .filter(Character::isLetter)
                .filter(c ->"aeiou".indexOf(c) != -1)
                .count();
        System.out.println("vowels: "+vowels);
        long consonants  = input.chars()
                .filter(Character::isLetter)
                .filter(c ->"aeiou".indexOf(c) == -1)
                .count();
        System.out.println("consonants: "+consonants);
    }

    private static String getLongestString(String str) {
        if(str == null || str .isEmpty()){
            return  "";
        }

        String[] words = str.split("\\s+");
        String longest = "";
        for(String word : words){
            if(word.length() > longest.length() ){
                longest = word;
            }
        }
        return longest;
    }

    private static String reverseTheSentence(String input) {
        String[] words = input.split(" ");
        StringBuilder sb =  new StringBuilder();

        StringBuilder result = new StringBuilder();
        for(String word: words){
            String  reverse = new StringBuilder(word).reverse().toString();
            result.append(reverse).append(" ");
        }
        return result.toString().trim();
    }

    public static boolean checkIsAnagram1(String s1, String s2) {

        s1 = s1.toLowerCase().replaceAll("\\s+", "");
        s2 = s2.toLowerCase().replaceAll("\\s+", "");

        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s1.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            if (!freq.containsKey(c)) {
                return false;
            }
            freq.put(c, freq.get(c) - 1);
            if (freq.get(c) == 0) {
                freq.remove(c);
            }
        }

        return freq.isEmpty();
    }

    private static boolean checkIsAnagram(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1,s2);
    }
}
