package com.arr;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithOne {
    static void main() {
        List<Integer> list = Arrays.asList(11,18,20, 24, 85, 66, 13);
        List<Integer> collect = list.stream()
                .map(String::valueOf)
                .filter(num -> num.startsWith("1"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("\n");
        List<Integer> collect1 = list.stream()
                .filter(num -> Integer.toString(num).startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(collect1);
    }
}
