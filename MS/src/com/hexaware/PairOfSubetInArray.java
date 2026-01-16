package com.hexaware;

import java.util.Arrays;
import java.util.List;

public class PairOfSubetInArray {
    static void main() {
        int[] arr = {4, 5, 7, 11, 9, 13, 8, 12};
        int sum = 20;

       findPairs(arr, sum);
        System.out.println("\n========================");
        List<Integer> list =    Arrays.stream(arr)
                .boxed()
                .toList();

        list.stream()
                .forEach( i ->
                        list.stream()
                                .filter(j ->j > i && (i+j) ==sum)
                                .forEach(j -> System.out.println(i+" ,"+j))
                );
    }

    private static void findPairs(int[] arr, int sum) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            if(arr[left]+arr[right] == sum){
                System.out.println(arr[left]+", "+arr[right] +" = "+sum);
                left++;
                right--;
            }else if(sum > arr[left]+arr[right]){
                left++;
            }else{
                right--;
            }
        }
    }
}
