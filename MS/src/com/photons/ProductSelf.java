package com.photons;

import java.util.Arrays;

public class ProductSelf {
    static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productSelf(arr)));
    }

    private static int[] productSelf(int[] arr) {
        int n= arr.length;
        int[] result = new int[n]; //[1,1,2,6]
        result[0] = 1;
        for(int i=1; i<n; i++){
            result[i] = result[i-1]*arr[i-1];
        }
        int suffix = 1;
        for(int i=n; i>=0; i--){
            result[i] = result[i]*suffix;
            suffix *= arr[i];
        }
        return result;
    }
}
