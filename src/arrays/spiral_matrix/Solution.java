package arrays.spiral_matrix;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0) return result;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}

// Explanation
// We use four variables top, bottom, left and right to keep track of the bounds of the matrix.
// We initialize top to 0, bottom to matrix.length - 1, left to 0 and right to matrix[0].length - 1.
// We iterate over the matrix until top is less than or equal to bottom or left is less than or equal to right.
// For left to right traversal, i = top and left <= j <= right. Finally, increment top.
// For top to bottom traversal, j = right and top <= i <= bottom. Finally, decrement right.
// For right to left traversal, we need to confirm top <= bottom to avoid duplicate traversal,
// and i = bottom and right >= j >= left. Finally, increment left.
// For bottom to top traversal, we need to confirm left <= right to avoid duplicate traversal,
// and j = right and bottom >= j >= top. Finally, decrement bottom.
