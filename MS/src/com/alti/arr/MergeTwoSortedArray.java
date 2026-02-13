package com.alti.arr;

public class MergeTwoSortedArray {
    static void main() {
        int arr1[] = {1,3,6,8};
        int arr2[] = {2,3,4,5,7};

      int[] result=  mergeSorteadArray(arr1, arr2);
      for (int num : result){
          System.out.print(num+", ");
      }
    }

    private static int[] mergeSorteadArray(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int []result = new int[m+n];
        int i=0,j=0;
        int k=0;
        while(i<m && j<n){
            if(arr1[i] <= arr2[j]){
                result[k++] = arr1[i++];
            }else{
                result[k++] = arr2[j++];
            }
        }

        while(i<m)
            result[k++] = arr1[i++];
        while (j>n)
            result[k++] = arr2[j++];
        return result;
    }
}
