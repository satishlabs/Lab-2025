package com.mphasis;

public class MissingNumber {
    static void main() {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 3, 5};

        System.out.println(findMissing(arr1)); // 5
        System.out.println(findMissing(arr2)); // 4
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
