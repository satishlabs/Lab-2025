package com.str;

import java.util.Arrays;
import java.util.Comparator;

public class LargestString {
    public static void main(String[] args) {
        String str = "I love Microservice";
        String s = Arrays.stream(str.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println(s);
    }
}
