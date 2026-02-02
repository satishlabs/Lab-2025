package com.infogain;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CharachterFrequencyInAsc {
    static void main() {
        "Swiss".chars()
                .mapToObj(c ->(char)c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

        System.out.println("\n============================");
        String str = "ABC";
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                System.out.println(str.substring(i,j));
            }
        }
        System.out.println("\n===============================");
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MIN_VALUE > 0.0d);
        Set<Integer> set = new HashSet<>();
        set.add(null);
        System.out.println(set.size());
    }

}
