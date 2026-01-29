package com.capgemini;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamLbas {
    static void main() {
            List<Integer> lst = new ArrayList<Integer>();
            lst.add(1);
            lst.add(2);
            lst.add(3);
            Stream<Integer> stream = lst.stream();
       // stream.forEach(System.out::println); //Here we will get the concurrentModificationException
            lst.add(4);
            lst.add(5);
            stream.forEach(System.out::println);
        lst.stream().forEach(i -> {
            lst.add(10); // modification during iteration
        });
    }
}
