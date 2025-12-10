package com.jdk8.stream;

import java.util.Arrays;
import java.util.List;

public class CountStringWhereSpecificCharacterExists {
    static void main() {
        List<String> strings = Arrays.asList("apple","banana","orange","grape","list");
        char searchChar = 'a';
        long count = strings.stream()
                .filter(str ->str.contains(String.valueOf(searchChar)))
                .count();
        System.out.println("Number of Strings: "+count);
    }
}
