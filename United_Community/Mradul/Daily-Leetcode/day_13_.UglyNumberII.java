// https://leetcode.com/problems/ugly-number-ii/

class Solution {
    public int nthUglyNumber(int n) {
        int[] nums = new int[n];
        nums[0] = 1;

        int ind2 = 0, ind3 = 0, ind5 = 0;

        for (int i = 1; i < n; i++) {
            int min = Math.min(Math.min(2*nums[ind2], 3*nums[ind3]), 5*nums[ind5]);
            nums[i] = min;
            if (min == 2*nums[ind2]) {
                ind2++;
            }
            if (min == 3*nums[ind3]) {
                ind3++;
            }
            if (min == 5*nums[ind5]) {
                ind5++;
            }
        }
        return nums[n-1];
    }
}