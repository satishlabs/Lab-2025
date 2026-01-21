package com.test;

public class MoveAllZeroAt {
    static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveAllZeroAtEnd(arr);
        System.out.println("\n==============");
        moveAllZeroAtStart(arr);
        }

    private static void moveAllZeroAtStart(int[] arr) {
        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int n: arr){
            System.out.print(n+", ");
        }
    }

    private static void moveAllZeroAtEnd(int[] arr) {
        int j = arr.length;
        for(int i = arr.length; i<=0; i++){
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for(int n: arr){
            System.out.print(n+", ");
        }
    }
}

