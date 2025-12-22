package com.capgemini;

import java.util.Arrays;
import java.util.List;

public class PrintStringStartWithDigit {
    static void main() {
        String[] arr = {"One", "2Two", "Three", "4Four", "5Five"};
       List<String> result = Arrays.stream(arr)
                .filter(s -> Character.isDigit(s.charAt(0)))
                .toList();
        System.out.println(result);
    }


}
