// https://leetcode.com/problems/search-insert-position/


class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = BinearySort (nums, 0, nums.length - 1, target);

        if (index == -1) {
            for (int i = 0; i < nums.length-1; i++) {
                if (target >= nums[i] && target <= nums[i + 1]) {
                    return i+1;
                }
            }
            if (nums[0] > target) {
                return 0;
            }
            else {
                return nums.length;
            }
        }
        return index;
    }

    public static int BinearySort (int[] nums, int start, int end, int key) {
        int mid = (start + end)/2;

        if (start <= end) {
            if (nums[mid] == key) {
                return mid;
            }
            else if (nums[mid] < key) {
               return BinearySort (nums, mid + 1, end, key);
            }
            else {
               return BinearySort (nums, start, mid - 1, key);
            }
        }

        return -1;
    }
}