package com.matrix;

public class RotateImage {
    static void main() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotateMatrix(matrix);

       for(int[] row : matrix){
           for(int val : row){
               System.out.print(val+" ");
           }
           System.out.println();
       }
    }

    private static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;

        //Step1: Transpose
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //step2: Reverse each row
        for(int i=0; i<n; i++){
            int left = 0;
            int right = n-1;
             while(left < right){
                 int temp = matrix[i][left];
                 matrix[i][left] = matrix[i][right];
                 matrix[i][right] = temp;
                 left++;
                 right--;
             }
        }

    }
}
