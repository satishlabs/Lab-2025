package com.infogain;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class FindSumAlternative {
    static void main() {
        List<Integer> list = Arrays.asList(1,6,3,2,4,8,9);
        int sum=0;
        int avg=0;
        int count=0;
        for(int i=0; i<list.size(); i++){
            if(i%2==0){
                sum = sum+list.get(i);
            }else {
                avg = avg+list.get(i);
                count++;
            }
        }
        double average = (count > 0) ? (double) sum / count : 0;
        System.out.println("sum : "+sum);
        System.out.println("average: "+average);

        System.out.println("\n===========================");
       int sumAlternative = IntStream.range(0, list.size())
                .filter(i ->i%2 == 0)
                .map(i->list.get(i))
                .sum();
        System.out.println("Sum of alternative elements : "+sumAlternative);
       OptionalDouble avg1 = IntStream.range(0, list.size())
               .filter(i -> i%2 != 0)
               .map(i-> list.get(i))
                       .average();
        System.out.println("Avg of alternative elements : "+avg1);
    }
}
