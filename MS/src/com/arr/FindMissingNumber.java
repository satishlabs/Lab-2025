package com.arr;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        int missingNumber = findMissingNumber(arr);
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
