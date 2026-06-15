import java.util.Arrays;

public class SetZero {
    // 73. Set Matrix Zeroes

    /**
     * @param matrix
     */
    public static void setZero(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;

                }
            }
        }git

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {

        int [][] matrix = {
            {1,1,1},
           { 1,0,1},
           {1,1,1}
        
        };

        int [][] matrix1 = {
            {0,1,1},
           { 1,0,1},
           {1,1,1}
        
        };


         setZero(matrix);
         printMatrix(matrix);
        //  setZero(matrix1);
        
    }

}
