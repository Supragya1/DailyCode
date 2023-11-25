//https://leetcode.com/problems/trapping-rain-water/
class Solution {
    public int trap(int[] h) {
        int n = h.length, water = 0;
        if (n < 2) {
            return 0;
        }
        int[] LeftMax = new int[n];
        int[] RightMax = new int[n];

        LeftMax[0] = h[0];
        RightMax[n-1] = h[n-1];

        for (int i = 1; i < n; i++) {
            LeftMax[i] = Math.max(LeftMax[i-1], h[i]);
        }

        for (int i = n-2; i >= 0; i--) {
            RightMax[i] = Math.max(RightMax[i+1], h[i]);
        }

        for (int i = 1; i < n-1; i++) {
            water += (Math.min(RightMax[i], LeftMax[i]) - h[i]);
        }

        return water;
    }
}