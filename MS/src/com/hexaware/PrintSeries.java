package com.hexaware;

import java.util.stream.IntStream;

/*
Print the series using Java 8 only
11, 12, 15, 20, 27

* */
public class PrintSeries {
    static void main() {
        int start = 11;
        IntStream.iterate(0, i -> i+1)
                .limit(5)
                .map(i -> start+i*i)
                .forEach(System.out::println);

        System.out.println("\n=======================");
        int sum = 0;
        for(int i=0; i<5; i++){
            sum = start+i*i;
            System.out.println(sum);
        }
    }
}
