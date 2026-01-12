package com.hexaware;

import java.util.List;

public class FlatMapExample {
    static void main(String[] args) {
        List<List<Integer>> list = List.of(
                List.of(1,2),
                List.of(3,4)
        );

       List<Integer> result = list.stream()
               .flatMap(l -> l.stream())
               .toList();
        System.out.println(result);
    }
}
