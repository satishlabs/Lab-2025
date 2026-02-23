package com.arr;

public class RemoveDuplicateElementInSortedArray {
    static void main(String[] args) {
        int[] arr = {5,5,7,8,8,9,9,10,10};
        System.out.println(removeDuplicate(arr));
    }

    private static int removeDuplicate(int[] arr) {
        int uniqueIndex = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[uniqueIndex]){
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        return uniqueIndex+1;
    }
}
