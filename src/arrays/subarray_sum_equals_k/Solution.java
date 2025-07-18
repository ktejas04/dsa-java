package arrays.subarray_sum_equals_k;

import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0, currSum=0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for (int i : nums) {
            currSum += i;

            if (map.containsKey(currSum - k)) {
                count += map.get(currSum - k);
            }

            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }
}

// Explanation
// We use a hash map to store the sum of subarrays ending at each index.
// We iterate over the array, and for each element, we check if the sum of the subarray ending at the current index - target is already present in the map.
// If yes, we increment the count by the number of times the sum is already present in the map.
// Otherwise, we add the sum of the subarray ending at the current index to the map.