// https://leetcode.com/problems/remove-element/


class Solution {
    public int removeElement(int[] nums, int val) {
        int rigth = nums.length - 1, left = 0;
        
        while (rigth >= left) {
            if (nums[left] == val) {
                int temp = nums[left];
                nums[left] = nums[rigth];
                nums[rigth] = temp;
                rigth--;
            }
            else {
                left++;
            }
        }

        return rigth + 1;
    }
}