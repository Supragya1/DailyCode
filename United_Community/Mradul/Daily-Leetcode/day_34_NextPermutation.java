// https://leetcode.com/problems/next-permutation/


class Solution {
    public void nextPermutation(int[] nums) {
        int idx1 = -1;
        int idx2 = -1;
        
        // findind the breaking point
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i + 1] > nums[i]) {
                idx1 = i;
                break;
            }
        }

        if (idx1 == -1) {
            revers(nums, 0);
        }
        else {
            // find the next element gerather that ind1 and sawp
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] > nums[idx1]) {
                    idx2 = i;
                    break;
                }
            }

            sawp(nums, idx1, idx2);

            revers(nums, idx1 + 1);
        }

        return;
    }

    public static void sawp(int[] nums, int i, int j) {
        // nums[i] = nums[i] ^ nums[j];
        // nums[j] = nums[i] ^ nums[j];
        // nums[i] = nums[i] ^ nums[j];
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        return;
    }

    public static void revers(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;

        while (i < j) {
            sawp(nums, i++, j--);
        }

        return;
    }
}