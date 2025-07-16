package arrays.majority_element;

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        // First pass: To find a candidate
        for (int num : nums) {
            if (count == 0) candidate=num;
            count += (num == candidate) ? 1 : -1;
        }

        // Second pass(not required): To verify if the candidate is a majority element
        /* for (int num: nums) {
        *   if (num == candidate) count++;
        * }
        *
        * return (count > nums.length/2) ? candidate : null; */

        return candidate;
    }
}

// Explanation
// Using Moore's algorithm : Cancel out pair of majority(candidate) and non-majority elements.
// If there was a majority element, count after cancelling non-majority elements in pairs would be greater than 0.
// We use a count variable to keep track of the number of times a candidate appears in the array.
// If the count is 0, we set the candidate to the current element.
// Now, we iterate over the array and increment/decrement the count
// based on whether the current element is equal to the candidate.
// If count becomes 0, we set the candidate to the next element in the array.
// Finally, we return the candidate.
// It was given that there is definitely a majority element in the array.
// Otherwise, we would have needed another iteration to verify count of candidate and
// return candidate if count greater than length of array/2, else return null.
