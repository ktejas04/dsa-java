package arrays.pascals_triangle;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i=0; i<numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j=0; j<=i; j++) {
                if (j==0 || j==i) {
                    row.add(1);
                }
                else {
                    int val = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
                    row.add(val);
                }
            }

            triangle.add(row);
        }

        return triangle;
    }
}

// Explanation
// We use a list to store each row of the triangle.
// Every row's length is equal to the index of the row + 1.
// If the current index is 0 or the last index, we add 1.
// Otherwise, we add the sum of the elements at the current index - 1 and current index of the previous row.