package com.alti.map;

import java.util.Arrays;
import java.util.List;
/*
My goal?
Extract all words from all sentences.
It will return Stream<String[]>
* */
public class FlatMapLab {
    static void main(String[] args) {
        List<String> sentence = List.of("Java is powerful","Stream are elegant");
        //It will return Stream<String[]>
        sentence.stream()
                .map(str ->str.split(" "))
                .forEach(arr -> System.out.println(Arrays.toString(arr)));

        System.out.println("\n===================");
        sentence.stream()
                .flatMap(str -> Arrays.stream(str.split(" ")))
                .forEach(System.out::println);
    }
}
