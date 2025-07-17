package arrays.maximum_subarray;

class Solution {
    public int maxSubArray(int[] nums) {
        int currentMaxSum = nums[0];
        int maxSum = nums[0];

        for(int i=1; i<nums.length; i++) {
            currentMaxSum = Math.max(nums[i], currentMaxSum + nums[i]);
            maxSum = Math.max(maxSum, currentMaxSum);
        }

        return maxSum;
    }
}


// Explanation
// We use a variable currentMaxSum to keep track of the maximum sum of subarray ending at the current index.
// We initialize currentMaxSum to nums[0].
// We iterate over the array from index 1 to the end.
// If the current element is greater than the sum of the subarray ending at the current index,
// we update currentMaxSum to the current element.
// Otherwise, we update currentMaxSum to the sum of the subarray ending at the current index plus the current element.
// Finally, we return the maximum of currentMaxSum and maxSum.

// For the follow up on divide and conquer approach, we can split the array and
// perform operations similar to Merge Sort.

// For getting the sub-array with maximum sum, we can use start, end and tempStart variables.
