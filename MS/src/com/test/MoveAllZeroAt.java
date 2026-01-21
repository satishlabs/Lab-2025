package com.test;

public class MoveAllZeroAt {
    static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveAllZeroAtEnd(arr);
        System.out.println("\n==============");
        arr = new int[]{0, 1, 0, 3, 12};
        moveAllZeroAtStart(arr);
        }
    private static void moveAllZeroAtEnd(int[] arr) {
        int j = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] != 0) {
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        for(int n: arr){
            System.out.print(n+" ");
        }
    }

    private static void moveAllZeroAtStart(int[] arr) {
        int j = arr.length-1;
        for(int i= arr.length-1; i>=0; i--){
            if(arr[i] != 0) {
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j--;
            }
        }
        for(int n: arr){
            System.out.print(n+", ");
        }
    }


}

