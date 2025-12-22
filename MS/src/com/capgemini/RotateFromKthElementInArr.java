package com.capgemini;

import java.util.Arrays;

public class RotateFromKthElementInArr {
    static void main() {
        int[] arr = {1,2,3,4,5};
        int k= 2;
        rotateFromKth(arr, k);
    }

    private static void rotateFromKth(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n];
        int index = 0;
        for(int i=n-k; i<n; i++){
            result[index++] = arr[i];
        }

        for(int i=0; i<n-k; i++){
            result[index++] = arr[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
