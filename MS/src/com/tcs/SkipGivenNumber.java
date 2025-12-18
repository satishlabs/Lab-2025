package com.tcs;

import java.util.stream.IntStream;

public class SkipGivenNumber {
    static void main() {
        int n=10;
        IntStream.iterate(1, i->i+1)
                .filter(i -> i<5 || i>8)
                .limit(n)
                .forEach(System.out::println);
    }
}
