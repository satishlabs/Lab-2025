package com.infogain;

import java.util.Arrays;
import java.util.List;

public class FlatMapLab {
    static void main() {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("Java", "Docker"),
                Arrays.asList("Docker", "Kubernetes"),
                Arrays.asList("AWS","Kafka")
        );

        list.stream()
               // .flatMap(l -> l.stream())
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
