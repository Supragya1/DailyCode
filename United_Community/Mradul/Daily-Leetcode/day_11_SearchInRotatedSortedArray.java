// https://leetcode.com/problems/search-in-rotated-sorted-array/

class Solution {
    public int search(int[] nums, int key) {
        int pivot = PivotIndex(nums);
        if (pivot == -1) {
            return BinearySearch (nums, key, 0, nums.length - 1);
        }
        else if (key >= nums[0]) {
            return BinearySearch (nums, key, 0, pivot);
        }
        else {
            return BinearySearch (nums, key, pivot, nums.length - 1);
        }
    }

    public static int PivotIndex (int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i+1]) {
                return i+1;
            }
        }
        return -1;
    }

    public static int BinearySearch (int[] nums, int key, int start, int end) {
        int mid = (start + end)/2;

        if (start > end) {
            return -1;
        }

        if (key == nums[mid]) {
            return mid;
        }
        else if (key > nums[mid]) {
            return BinearySearch (nums, key, mid + 1, end);
        }
        else {
            return BinearySearch (nums, key, start, mid - 1);
        }
    }
}