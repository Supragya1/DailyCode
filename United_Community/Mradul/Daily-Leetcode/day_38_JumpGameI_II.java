// https://leetcode.com/problems/jump-game-ii/

class Solution {
    public int jump(int[] nums) {
        int ans = 0;        
        int end = 0;        
        int farthest = 0;   

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);   // Update farthest reachable index

            // Check if the farthest index is greater than or equal to the last index
            if (farthest >= nums.length - 1) {
                ans++;    
                break;    
            }

            // Check if all items on the current level are visited
            if (i == end) {
                ans++;        // Increment ans to move to the next level
                end = farthest;   // Update the end index for the next level
            }
        }

        return ans;   
    }
}
