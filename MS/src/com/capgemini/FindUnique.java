package com.capgemini;

import java.util.Arrays;
import java.util.List;

public class FindUnique {
    static void main(String[] args) {
        String[] str = {"apple","apple","pineapple"};
       List<String> list = Arrays.stream(str)
                .filter(w ->w.startsWith("a"))
                .toList();
        System.out.println(list);
    }
}
