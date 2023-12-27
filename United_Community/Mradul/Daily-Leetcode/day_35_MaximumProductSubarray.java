// https://leetcode.com/problems/maximum-product-subarray/


class Solution {
    public int maxProduct(int[] nums) {
        int p1 = 0;
        int max1 = Integer.MIN_VALUE;
        int p2 = 0;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (p1 == 0) {
                p1 = nums[i];
            }
            else {
                p1 *= nums[i];
            }
            
            max1 = Math.max(max1, p1);
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (p2 == 0) {
                p2 = nums[i];
            }
            else {
                p2 *= nums[i];
            }

            max2 = Math.max(max2, p2);
        }

        return Math.max(max1, max2);
    }
}