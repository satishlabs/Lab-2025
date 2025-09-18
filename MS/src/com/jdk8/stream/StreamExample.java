package com.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Satish", "Prasad", "Java", "Stream", "API");
        List<String> result = names.stream()
                .filter(n -> n.length() > 4) //Intermediate
                .map(String:: toUpperCase)  //Intermediate
                .sorted() //Intermediate
                .collect(Collectors.toList()); //Terminal
        System.out.println(result);
    }
}
