package com.alti.arr;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10,15,7,25,15,8,45};
        System.out.println("Second Largest: "+findSecondLargestElement(arr));
    }

    private static int findSecondLargestElement(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                // new largest found
                second = first;
                first = num;
            } else if (num > second && num < first) {
                // new second largest
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE)
            throw new RuntimeException("No second largest element found (all elements equal)");

        return second;
    }
}
