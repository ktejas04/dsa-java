package arrays.search_a_2d_matrix;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0, right = m * n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int val = matrix[mid / n][mid % n];
            if (val == target)
                return true;
            else if (val < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return false;
    }
}

// Explanation
// We use two pointers left and right to iterate over the array.
// It is given that the first element of the current row is greater than the previous row's last element.
// So technically, it is a sorted 1-D array with m * n elements.
// We initialize left to 0 and right to m * n - 1.
// We perform binary search: mid / n represents row, and mid % n represents column.

// Another approach: Perform a binary search to find the row where the target element may be present.
// Then, perform another binary search to find if the target element is actually present in the row.
