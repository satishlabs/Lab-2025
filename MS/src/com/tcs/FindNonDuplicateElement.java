package com.tcs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindNonDuplicateElement {
    static void main(String[] args) {

        //Find the only non duplicate element in the below array
        int[] arr = {4,1,2,1,2,3,5,5};

        Set<Map.Entry<Integer, Long>> map =  Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(n->n, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(n ->n.getValue() == 1)
                        .collect(Collectors.toSet());

        System.out.println(map);
        System.out.println("\n========================");
        List<Integer> result = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(n ->n, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e ->e.getValue() ==1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(result);

    }
}
