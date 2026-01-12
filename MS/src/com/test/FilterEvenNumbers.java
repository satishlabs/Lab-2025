package com.test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterEvenNumbers {
    static void main() {
        IntStream.rangeClosed(1,10)
                .filter(n -> n%2 == 0)
                .forEach(System.out::println);

    }
}
