package com.str;

public class ReverseString {
    static void main() {
        String str = "Satish";
        char[] arr = str.toCharArray();
       int left = 0;
       int right = arr.length-1;
       while (left < right){
           char temp = arr[left];
           arr[left] = arr[right];
           arr[right] = temp;
           left++;
           right--;
       }
        System.out.println(arr);
    }
}
