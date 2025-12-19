package com.embetal;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCountInDesc {
    static void main() {
        int[] arr = {1,2,2,1,2,5,6,5,7,6,6};
       int identity =  Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(e ->e, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
        System.out.println("Identity: "+identity);

        Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .collect(Collectors.toList()).forEach(e ->{
                    System.out.println(e.getKey()+" "+e.getValue());
                });
    }
}
