package fb;

public class SearchIn2DSortedArray {
    static void main() {
        int[][] matrix = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17}
        };

        int target = 8;
        System.out.println(searchMatrix(matrix, target));
        System.out.println("\n====================");
        System.out.println(searchMatrix1(matrix, target));
    }

    private static boolean searchMatrix1(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length-1; //start from top right;
        while(row < matrix.length && col >= 0){

        if(matrix[row][col] == target){
            return true;
        }else if(matrix[row][col] > target){
            col--; //move down
        }else{
            row++;
        }
    }
        return false;
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i =0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
