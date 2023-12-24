// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/


class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length -1;
        while(left < right) {
            int middle = (right + left) / 2;
            // If we find a value less than the right side, we can ignore the rest of the right side
            if(nums[middle] < nums[right]) {
            // We avoid middle - 1 as middle can be the smallest value
                right = middle;
            }
            else {
            // Otherwise we can ignore the entirety of the left side
                left = middle + 1;
            }
        }
        return nums[left];
    }
}