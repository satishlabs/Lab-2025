package com.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxFromTwoLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);

        Optional<Integer> max1 = list1.stream().max(Integer::compareTo);
        Optional<Integer> max2 = list2.stream().max(Integer::compareTo);

        Optional<Integer> overAllMax = max1.isPresent() && max2.isPresent() ? Optional.of(Math.max(max1.get(), max2.get()))
                : max1.isPresent() ? max1 : max2;
        overAllMax.ifPresent(max -> System.out.println("Max: "+max));
    }
}
