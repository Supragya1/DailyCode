// https://leetcode.com/problems/container-with-most-water/


class Solution {
    // https://www.notion.so/day_27-461b89eea7ab452592eeee7548497d33?pvs=4
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0, rigth = height.length - 1;
        // for (int i = 0; i < height.length; i++) {
        //     for (int j = i+1; j < height.length; j++) {
        //         min = (int)Math.min(height[i], height[j]);
        //         max = (int)Math.max(max, Math.abs(i-j)*min);
        //     }
        // }
        while (left < rigth) {
            int h = Math.min(height[left], height[rigth]);
            int w = rigth - left;
            max = Math.max(max, h * w);

            if (height[left] < height[rigth]) {
                left++;
            }
            else {
                rigth--;
            }
        }
        return max;
    }
}