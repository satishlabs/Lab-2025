package com.trees;

public class BST {
    static void main() {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;
        int index = binarySearch(arr, target);
        System.out.println(index != -1 ? "Element found at index: "+index : "Element not found");
        System.out.println("\n======================");
        arr = new int[]{2, 4, 6, 8, 10, 12, 14};
       int left = 0;
       int right = arr.length-1;
        index = binarySearch1(arr, target, left, right);
        System.out.println(index != -1 ? "Element found at index: "+index : "Element not found");
    }

    private static int binarySearch1(int[] arr, int target, int left, int right) {
        if(left > right)
            return -1;
        int mid = left+(right-left)/2;

        if(arr[mid] == target)
            return mid;

        if(arr[mid] > target){
            return binarySearch1(arr, target, left, mid-1);
        }else{
            return binarySearch1(arr, target, mid+1, right);
        }
    }


    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        while (left <= right){
            int mid = left+(right-left)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
}
