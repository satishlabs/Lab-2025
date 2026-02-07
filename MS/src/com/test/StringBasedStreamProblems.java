package com.test;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringBasedStreamProblems {
    static void main(String[] args) {
       //1. First non-repeated character
        System.out.println("\n 1. First non-repeated character");
     Character first = "Satish".toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                        .orElse(null);

        System.out.println(first);
        System.out.println("\n=================================");

        //2.First repeated character
        System.out.println("\n 2.First repeated character");
    Character secondRepeated =   "satihs".chars()
                .mapToObj(c ->(char)c)
                .collect(Collectors.groupingBy(c ->c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(c ->c.getValue()>=1)
                .map(Map.Entry::getKey)
                .findFirst()
            .orElse(null);
        System.out.println(secondRepeated);
        System.out.println("\n=================================");
        System.out.println("\n 3.  ⃣All non-repeated characters");
        Stream<Character> characterStream = "satish".chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(c -> c.getValue() == 1)
                .map(Map.Entry::getKey);
        System.out.println(characterStream.toList());
        System.out.println("\n=================================");
        //4. Character frequency count
        System.out.println("\n 4. Character frequency count");
        "SatiSH".toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                        .entrySet()
                                .stream()
                                        .forEach(System.out::println);
        //5. Anagram check
        System.out.println("\n=================================");
        System.out.println("\n 5. Anagram check ");
        String s1 = "Listen";
        String s2 = "Silent";

        boolean isAnagram = isAnagram(s1, s2);
        System.out.println(isAnagram);
        System.out.println("\n=================================");
        //6. Reverse each word in a sentence
        System.out.println("\n 6. Reverse each word in a sentence ");
        String sentence = "I am a Java developer";
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String  word: words){
            sb.append(new StringBuilder(word).reverse()).append(" ");
        }
        System.out.println(sb.toString().trim());

        for(String word: words){
            for(int i=word.length()-1; i>=0; i--){
               sb.append(word.charAt(i));
            }
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
        String result = Arrays.stream(sentence.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                        .collect(Collectors.joining(" "));
        System.out.println(result);
        System.out.println("\n=================================");
        System.out.println("7. Longest word from string");
        //7. Longest word from string
        String longestWord = "";
        for(String word: words){
            if(word.length() > longestWord.length()){
                longestWord = word;
            }
        }
        System.out.println("Longest Word: "+longestWord);
        String longWord = Arrays.stream(sentence.split(" "))
                .max(Comparator.comparingInt(String::length))
                        .orElse(null);
        System.out.println(longWord);
        System.out.println("\n=================================");
        System.out.println("8. Remove duplicate characters");
        //8. Remove duplicate characters
        StringBuilder sb1 = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for(Character c: "Satish".toLowerCase().toCharArray()){
            if(set.add(c)){
                sb1.append(c);
            }
        }
        System.out.println(sb1.toString());
        String collect = "Satish".toLowerCase().chars()
                .mapToObj(c -> String.valueOf((char) c))
                .distinct()
                .collect(Collectors.joining());
        System.out.println(collect);
        System.out.println("\n=================================");
        System.out.println("9. Sort characters alphabetically");
        //9. Sort characters alphabetically
        char[] chars = "Satish".toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println(sorted);

        char[] charArr = "ProGraMming".toLowerCase().toCharArray();
        Arrays.sort(charArr);
        System.out.println(new String(charArr));
        System.out.println("\n=================================");
        System.out.println("10. Count vowels & consonants");
        //10. Count vowels & consonants

        System.out.println("\n=================================");
        //11. All SubString
        System.out.println("11. All SubString");
        String str1 = "abc";
        IntStream.range(0, str1.length())
                .forEach(i -> IntStream.range(i+1, str1.length()+1)
                        .forEach(j -> System.out.println(str1.substring(i,j))));
        System.out.println("\n=================================");
        //12. From a list of list of strings, find all strings starting with “S”
        System.out.println("\n 12. From a list of list of strings, find all strings starting with “S”");
        List<List<String>> list = List.of(
                List.of("Satish","Prasad"),
                List.of("Kumar", "Santosh")
        );
        list.stream()
                .flatMap(List::stream)
                .filter(n ->n.startsWith("S"))
                .toList()
                .forEach(System.out::println);
        System.out.println("\n=================================");
        //13. From a list of integers: filter even numbers, square them, and skip the first 1 and last 2 elements using streams
        System.out.println("\n From a list of integers: filter even numbers, square them, and skip the first 1 and last 2 elements using streams");
        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> temp = intList.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toList();
        System.out.println(temp);
        List<Integer> result1 = temp.stream()
                .skip(1)
                .limit(Math.max(0, temp.size() - 1 - 2))
                .toList();

        System.out.println(result1);
    }

    private static boolean isAnagram(String s1, String s2) {
        s1 = s1.toLowerCase().replaceAll("\\s+","");
        s2 = s2.toLowerCase().replaceAll("\\s+","");
        if(s1.length() != s2.length())
            return false;
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}
