package com.arr;

import java.util.stream.IntStream;

///Print all submultiples between 1 and 100 for a given input.
public class SubMultiples {
    static void main() {
        int n=24;
        IntStream.rangeClosed(1,100)
                .filter(i -> n%i==0)
                .forEach(System.out::println);

        System.out.println("\n===================");
        int input = 6;
        int count=0;
        for(int i=1; i<=100; i++){
            if(input%i ==0 ){
                count++;
                System.out.print(i+ " ");
            }
        }
        System.out.println("Count "+count);
        System.out.println("\n===================");


    }
}
