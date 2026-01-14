package com.paypal;

public class MaxSubArrayWithIndex {
    static void main() {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = arr[0];
        int currSum = arr[0];

        int start = 0;
        int end =0;
        int temp = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]> currSum+arr[i]){
                currSum = arr[i];
                temp = 1;
            }else{
                currSum +=arr[i];
            }

            if(currSum > maxSum){
                maxSum = currSum;
                start = temp;
                end=i;
            }
        }
        System.out.println("Max sum : "+maxSum);
        System.out.println("start index: "+start);
        System.out.println("end index: "+end);
    }
}
