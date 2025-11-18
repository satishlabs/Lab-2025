package com.arr;

public class SortAnArray {
    public static void main(String[] args) {
        int[] arr = {5,2,8,9,11,7};
        sortArray(arr);
       for(int num : arr){
           System.out.print(num+" ");
       }
    }

    private static void sortArray(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] <arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
