package arrays.product_of_array_except_self;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] res = new int[nums.length];
        for (int i=0; i < nums.length; i++) {
            res[i] = product;
            product *= nums[i];
        }

        product = 1;
        for (int i=nums.length - 1; i >= 0; i--) {
            res[i] *= product;
            product *= nums[i];
        }

        return res;
    }
}

// Explanation
// We cannot use division, so we need to use postfix product and prefix product.
// We initialize product to 1.
// For each index i, the first pass gives us the prefix product before that index.
// For each index i, the second pass gives us the postfix product after that index,
// as we are iterating in reverse order. We multiply it by prefix product for that index.
// Finally, we return the result array.