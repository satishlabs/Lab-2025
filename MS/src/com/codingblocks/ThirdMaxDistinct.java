package com.codingblocks;

import java.util.*;

public class ThirdMaxDistinct {
    static void main() {
        int[] arr = {1, 2, 5, 4, 3, 1};
        thirdMaxDistinct(arr);
        System.out.println("\n==================");
        arr = new int[]{1, 2, 5, 4, 3, 1};
        thirdMaxDistinct1(arr);
    }

    private static void thirdMaxDistinct1(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }

        if(set.size()<3){
            System.out.println("Less than 3 distinct elements");
            return;
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Third maximum distinct element: "+list.get(2));
    }

    private static void thirdMaxDistinct(int[] arr) {
        Optional<Integer> first = Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst();
       first.ifPresent(System.out::println);
       /*
       boxed() → converts int to Integer
        distinct() → removes duplicates
        sorted(reverseOrder()) → sorts descending
        skip(2) → skips first two maximums
        findFirst() → gets the 3rd maximum
       * */
    }
}
