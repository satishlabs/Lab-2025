package com.wissen;

import java.util.Arrays;

public class MatrixSprial {
    public static void main(String[] args) {
        int[][] input = new int[][]
                {{1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                        {11, 12, 13, 14, 15},
                        {16, 17, 18, 19, 20}};
        //expected ans : {1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12}
        int[] linearArray = spiralTraversal(input);
        System.out.println(Arrays.toString(linearArray));
    }

    public static int[] spiralTraversal(int[][] matrix) {

        if (matrix == null || matrix.length == 0)
            return new int[0];

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] result = new int[rows * cols];
        int index = 0;

        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {

            // 1️⃣ Left → Right
            for (int i = left; i <= right; i++)
                result[index++] = matrix[top][i];
            top++;

            // 2️⃣ Top → Bottom
            for (int i = top; i <= bottom; i++)
                result[index++] = matrix[i][right];
            right--;

            // 3️⃣ Right → Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    result[index++] = matrix[bottom][i];
                bottom--;
            }

            // 4️⃣ Bottom → Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    result[index++] = matrix[i][left];
                left++;
            }
        }

        return result;
    }
}
