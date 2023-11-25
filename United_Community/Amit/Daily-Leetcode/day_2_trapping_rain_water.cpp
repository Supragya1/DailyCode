class Solution {
public:
    int trap(vector<int>& height) {
        int n = height.size();
        if (n <= 2) {
            return 0;
        }

        int trap_water = 0;

        vector<int> l_max(n, 0);
        vector<int> r_max(n, 0);

        l_max[0] = height[0];
        for (int i = 1; i < n; ++i) {
            l_max[i] = max(l_max[i - 1], height[i]);
        }

        r_max[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; --i) {
            r_max[i] = max(r_max[i + 1], height[i]);
        }

        for (int i = 1; i < n - 1; ++i) {
            trap_water += max(0, min(l_max[i], r_max[i]) - height[i]);
        }

        return trap_water;
    }
};
