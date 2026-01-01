package com.str;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class AllSubstrings {
    static void main() {
        String str = "abc";
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                System.out.println(str.substring(i,j));
            }
        }

        System.out.println("\n===================");
        List<String> subString = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                subString.add(str.substring(i, j));
            }
        }
        System.out.println(subString);
        System.out.println("\n===================");

        IntStream.range(0,str.length())
                .forEach(i -> IntStream.range(i+1, str.length()+1)
                        .forEach(j -> System.out.println(str.substring(i, j)))
                );
    }
}
