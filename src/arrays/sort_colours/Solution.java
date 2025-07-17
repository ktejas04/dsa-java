package arrays.sort_colours;

class Solution {
    public void sortColors(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(mid<=end){
            switch(nums[mid]){
                case 0:
                    int temp=nums[mid];
                    nums[mid]=nums[start];
                    nums[start]=temp;
                    start+=1;
                    mid+=1;
                    break;
                case 1:
                    mid+=1;
                    break;
                case 2:
                    int temp1=nums[mid];
                    nums[mid]=nums[end];
                    nums[end]=temp1;
                    end--;
                    break;
            }
        }
    }
}

// Explanation
// We use three pointers start, mid and end to iterate over the array.
// We initialize start to 0, mid to 0 and end to nums.length-1.
// If the current element is 0, we swap it with the element at start and increment start.
// If the current element is 1, we increment mid.
// If the current element is 2, we swap it with the element at end and decrement end.