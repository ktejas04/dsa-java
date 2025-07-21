package arrays.merge_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            else return a[1] - b[1];
        });

        List<int[]> result = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                result.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][]);
    }
}

// Explanation
// We sort the intervals based on their first elements.
// We initialize start and end to the first element of the array.
// We iterate over the array, and if the current element's starting point is less than or equal to the previous element's ending point,
// we update the start point to the previous element's ending point. And the end point to the maximum of the current element's ending point and the previous element's ending point'.'
// Otherwise, we add the current element to the result array and initialize start and end to the current element.
// Finally, we return the result array.