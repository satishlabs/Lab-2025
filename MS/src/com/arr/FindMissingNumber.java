package com.arr;

import java.util.*;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        List<Integer> missingNumber = Collections.singletonList(findMissingNumber(arr));
        System.out.println(missingNumber);

        int[] arr1 = {1,2,4,6};
        int n = 6;
        int[] freq = new int[n+1];
        for(int num: arr1){
            if(num <= n)
                freq[num]++;

        }
        System.out.println("Missing number: ");
        for(int i=1; i<=n; i++){
            if(freq[i] == 0)
                System.out.print(i+" ");
        }

        System.out.println("\n=========================");
        int[] arr2 = {1,2,4,5,7,9};
        int max = 9;
        System.out.println(findMissingNumber1(arr2, max));
        System.out.println("\n=========================");
        System.out.println(findMissingNumber2(arr2, max));
    }

    private static List<Integer> findMissingNumber2(int[] arr2, int max) {
        Arrays.sort(arr2);

        List<Integer> missing = new ArrayList<>();
        int index = 0;
        for(int i=1; i<= max; i++){
            if(index < arr2.length && arr2[index] == i){
                index++;
            }else{
                missing.add(i);
            }
        }
        return missing;
    }

    private static List<Integer> findMissingNumber1(int[] arr2, int max) {
        Set<Integer> set = new HashSet<>();
        for(int num: arr2){
            set.add(num);
        }

        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=max; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }


    private static int findMissingNumber(int[] arr) {
        int n = arr.length+1;
        int totalSum = n*(n+1)/2;
        int arrSum = 0;
        for(int num: arr){
            arrSum+=num;
        }
        return totalSum-arrSum;
    }
}
