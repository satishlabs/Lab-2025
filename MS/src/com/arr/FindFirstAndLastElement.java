package com.arr;


import java.util.Arrays;
import java.util.List;

public class FindFirstAndLastElement {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple","Banana","Cherry","Date", "Elderberry");
        String firstElement = list.getFirst();
        String lastElement = list.getLast();
        System.out.println("First: "+firstElement+" Last: "+lastElement);
    }
}
