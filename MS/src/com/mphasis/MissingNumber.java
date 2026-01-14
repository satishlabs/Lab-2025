package com.mphasis;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    static void main() {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 3, 5};

        System.out.println(findMissing(arr1)); // 5
        System.out.println(findMissing(arr2)); // 4

        System.out.println("\n====================");
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int num : arr1){
            if(!set1.add(num)){
                set2.add(num);
            }
        }
        System.out.println(set2);
    }

    private static int findMissing(int[] arr) {
        int n = arr.length;
        int actualSum = 0;
        int repeating = -1;
        for(int i=0; i<n; i++){
            actualSum += arr[i];
            if(i >0 && arr[i] == arr[i-1]){
                repeating = arr[i];
            }
        }
        int expectedSum = n*(n+1)/2;
        return  expectedSum -(actualSum-repeating);
    }
}
