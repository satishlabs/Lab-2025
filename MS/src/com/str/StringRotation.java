package com.str;

import java.util.stream.IntStream;

public class StringRotation {
    static void main() {
        String str1 = "abcd";
        String str2 = "cdab";
        System.out.println(isRotation(str1, str2));
        System.out.println("\n=======================");
        boolean isRotation = IntStream.range(0, str1.length())
                .anyMatch(i ->(str1.substring(i)+str1.substring(0,i)).equals(str2));
        System.out.println(isRotation);
    }

    private static boolean isRotation(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }
        return (str1+str1).contains(str2);
    }
}
