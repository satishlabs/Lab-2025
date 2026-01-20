package com.test;

import java.util.*;
import java.util.stream.Collectors;

public class NumberBasedStream {
    static void main(String[] args) {
       // 1️⃣ Duplicate numbers in a list
        System.out.println("1.  Duplicate numbers in a list");
        List<Integer> list = Arrays.asList(1, 2, 17, 5, 6, 20, 1, 11, 15, 20);
        Set<Integer> set = new HashSet<>();
        list.stream()
                        .filter(n ->!set.add(n))
                                .forEach(System.out::println);
        System.out.println("\n===========================");
        list.stream()
                .collect(Collectors.groupingBy(e ->e, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e ->e.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
        System.out.println("\n==========================================");
        //2️⃣ Unique numbers
        System.out.println("2.  Unique numbers");
        list.stream()
                .collect(Collectors.groupingBy(e ->e, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e ->e.getValue() == 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
        System.out.println("\n==========================================");
        //3️⃣ Second highest number
        System.out.println("3.   Second highest number");
       Optional<Integer> secondHighest = list.stream()
                .sorted(Comparator.reverseOrder())
               .distinct()
                .skip(1)
                .toList()
                .stream().findFirst();
        secondHighest.ifPresent(System.out::println);
        System.out.println("\n==========================================");
       //4️⃣ Max & Min value
        System.out.println("4.   Max & Min value");
        Optional<Integer> max = list.stream()
                .distinct()
                .max(Integer::compareTo)
                .stream()
                .findFirst();
        max.ifPresent(n -> System.out.println("Max: "+n));
        System.out.println("\n==================");
        Optional<Integer> min = list.stream()
                .distinct()
                .min(Integer::compareTo)
                .stream()
                .findFirst();
       min.ifPresent(n -> System.out.println("Min: "+n));
        System.out.println("\n==========================================");
        //5️⃣ Sum of numbers
        System.out.println("5.   Sum of numbers");
        int sum = 0;
        for(int num : list){
            sum += num;
        }
        System.out.println("Sum : "+sum);
        int sum1 = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum1 : "+sum1);
        System.out.println(list.stream()
                .reduce(0, Integer::sum));
        System.out.println("\n==========================================");
        //6️⃣ Count even & odd numbers
        System.out.println("6.   Count even & odd numbers");
        list.stream()
                .distinct()
                .filter(n -> n%2==0)
                .toList().forEach(System.out::println);
        System.out.println("\n===============");
        list.stream()
                .distinct()
                .filter(n -> n%2 != 0)
                .toList().forEach(System.out::println);
        System.out.println("\n==========================================");
        //7️⃣ Sort ascending & descending
        System.out.println("7. Sort ascending & descending");
        list.stream()
                .distinct()
                .sorted(Integer::compareTo)
                .forEach(System.out::println);
        System.out.println("\n=================");
        list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        System.out.println("\n==========================================");
        //8️⃣ Numbers starting with 1
        System.out.println("8. Numbers starting with 1");
        list.stream()
                .distinct()
                .filter(n -> n.toString().startsWith("1"))
                .forEach(System.out::println);
        System.out.println("\n==========================================");
        //9️⃣ Remove duplicates
        System.out.println("9. Remove duplicates");
        list.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println("\n==========================================");
        //0️⃣ Average of numbers
        System.out.println("9. Average of numbers");
        OptionalDouble avg = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        avg.ifPresent(System.out::println);

    }
}
