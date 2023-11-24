class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int water_level = 0;
        int total_water = 0;
        int left[] = new int[n];
        int right[] = new int[n];

        // Right max boundary array
        right[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }

        // Left max boundary array
        left[0] = height[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        // Calculate water level and total water
        for (int i = 0; i < n; i++) {
            water_level = Math.min(left[i], right[i]);
            total_water += water_level - height[i];
        }

        return total_water;
    }
}