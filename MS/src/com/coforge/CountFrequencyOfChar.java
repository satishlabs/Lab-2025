package com.coforge;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class CountFrequencyOfChar {
    static void main() {
        String s = "Java";
        s.toLowerCase().chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c ->c, Collectors.counting()))
                .forEach((k,v) ->{
                    System.out.println(k+" = "+v);
                });
    }
}
