package com.jdk8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MaxFromTwoLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
        Optional<Integer> max = Stream.of(list1, list2)
                .flatMap(List::stream)
                .max(Integer::compareTo);
        System.out.println("OverAll Max"+max.orElse(null));


        System.out.println("\n===========================");
          Optional<Integer> secondMax = Stream.of(list1, list2)
                    .flatMap(List::stream)
                    .sorted(Comparator.reverseOrder())
                    .skip(1)
                    .findFirst();
        System.out.println("Second Max: "+secondMax.orElse(null));

    }
}
