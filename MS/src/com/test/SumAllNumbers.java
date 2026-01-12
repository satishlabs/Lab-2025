package com.test;

import java.util.Arrays;
import java.util.List;
//“reduce() combines all elements of a stream into a single result using an identity and accumulator function.”
public class SumAllNumbers {
    static void main() {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int sum = list.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);
            /*
    Step-by-Step Explanation
stream() → converts list into a stream
reduce(0, Integer::sum)
0 → identity value (initial sum)
Integer::sum → adds two integers
Result is a single value → total sum
    * */

        System.out.println("\n=================");
        sum = list.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum);
    }



}
