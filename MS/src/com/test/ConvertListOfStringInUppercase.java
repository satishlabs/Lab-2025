package com.test;

import java.util.List;

public class ConvertListOfStringInUppercase {
    static void main() {
        List<String> list = List.of("aAA","BbB","ccC","dDD");
        list.stream()
                .map(String::toUpperCase)
                .toList().forEach(System.out::println);
        System.out.println("\n====================");
        list.stream()
                .map(s ->s.toLowerCase())
                .toList().forEach(System.out::println);
    }

}
