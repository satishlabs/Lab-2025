package com.arr;

public class ReverseCharArray {
    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'i', 'l', 'o'};
        int l =0;
        int r = arr.length-1;
        while(l < r){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        System.out.println(arr);
    }
}
