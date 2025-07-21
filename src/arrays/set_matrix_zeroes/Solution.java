package arrays.set_matrix_zeroes;

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean isFirstRowZero = false;
        boolean isFirstColZero = false;

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                isFirstColZero = true;
                break;
            }
        }

        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                isFirstRowZero = true;
                break;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (isFirstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        if (isFirstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}


// Explanation
// We use two flags isFirstRowZero and isFirstColZero to keep track of whether
// any element in the first row or first column is 0 respectively.
// If the current element in the first row/first column is 0, we set the corresponding flag to true.
// We iterate over the matrix and then mark the first element of the row as 0 if any column of that row is 0.
// Likewise, we mark the first element of the column as 0 if any row of that column is 0.
// Next, we iterate over the matrix again and set matrix[i][j] to 0 if the corresponding row/column is 0.
// Finally, we set the first row and first column elements to 0 if their corresponding flags are true.

// The flags are needed to differentiate between the cases where the first row/column is 0 and the case where
// other elements in the row/column are 0. This avoids setting extra or less 0's.