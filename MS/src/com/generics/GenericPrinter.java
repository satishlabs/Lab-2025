package com.generics;

import java.util.Arrays;
import java.util.List;

public class GenericPrinter {
    static void main() {
        List<String> stringList = Arrays.asList("satish","test","abc","xyz");
        List<Integer> list = Arrays.asList(1,5,9,4);

        printList(stringList);
        printList(list);
    }

    private static void printList(List<?> list) {
        for(Object obj: list){
            System.out.println(obj);
        }
    }
}
