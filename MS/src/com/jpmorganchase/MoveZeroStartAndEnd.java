package com.jpmorganchase;

public class MoveZeroStartAndEnd {
    static void main(String[] args) {
        int[] arr = {0,1,2,0,12};
        moveAllZeroStart(arr);
        for (int num : arr){
            System.out.print(num+" ");
        }
        System.out.println("\n==================");
        int arr1[] = {0,1,2,0,12};
        moveZeroesEndSwap(arr1);
        for(int num : arr1){
            System.out.print(num+" ");
        }
        System.out.println("\n==================");
        int arr2[] = {0,1,2,0,12};
        moveZeroesStartSwap(arr2);
        for(int num : arr2){
            System.out.print(num+" ");
        }
    }

    private static void moveZeroesStartSwap(int[] arr2) {
        int right = arr2.length-1;
        for(int i = arr2.length-1; i>=0; i--){
            if(arr2[i] != 0){
                int temp = arr2[right];
                arr2[right] = arr2[i];
                arr2[i] = temp;
                right--;
            }
        }
    }

    private static void moveZeroesEndSwap(int[] arr) {
        int left  =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[left];
                arr[left] = arr[i];
                arr[i] = temp;
                left++;
            }
        }
    }

    private static void moveAllZeroStart(int[] arr) {
        int n = arr.length-1;

        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]!=0){
                arr[n--] = arr[i];
            }
        }

        while(n >= 0){
            arr[n--]=0;
        }
    }
}
