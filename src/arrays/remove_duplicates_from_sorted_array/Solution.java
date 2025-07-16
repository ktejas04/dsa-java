package arrays.remove_duplicates_from_sorted_array;

class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}

// Explanation
// We use two pointers i and j.
// i points to the first element of the array. j points to the next element of the array.
// If the element at j is different from the element at i, we increment i and copy the element at j to i.
// If the element at j is the same as the element at i, we increment j.
// When we reach the end of the array, we return i + 1, which is the number of unique elements in the array.