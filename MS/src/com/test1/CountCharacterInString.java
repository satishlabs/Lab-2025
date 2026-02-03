package com.test1;


import java.util.stream.IntStream;

public class CountCharacterInString {
    static void main() {
       String str = "swiss";
       int count=0;
       for(int i=0; i<str.length(); i++){
           count++;
       }
        System.out.println(count);
        System.out.println("\n==========================");
        System.out.println(IntStream.range(0, str.length()).count());
        System.out.println("\n======================");
        System.out.println(IntStream.rangeClosed(0, str.length()-1).count());
    }
}
