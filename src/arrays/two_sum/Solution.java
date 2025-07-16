package arrays.two_sum;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }
            seen.put(nums[i], i);
        }
        return new int[] {};
    }
}

// Explanation
// We use a hash map to store each element in the array along with its index.
// We iterate over the array, and for each element, we check if the complement is already present in the map(keys of the map).
// If yes, we return the indices of the elements. Otherwise, we add the element and its index to the hash map.
