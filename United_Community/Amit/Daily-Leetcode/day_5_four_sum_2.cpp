class Solution {
public:
    int fourSumCount(vector<int>& nums1, vector<int>& nums2, vector<int>& nums3, vector<int>& nums4) {
        int n = nums1.size();
        int count = 0;

        vector<int> sums1_2;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                sums1_2.push_back(nums1[i] + nums2[j]);
            }
        }

        sort(sums1_2.begin(), sums1_2.end());

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                int target = -(nums3[i] + nums4[j]);

                count += upper_bound(sums1_2.begin(), sums1_2.end(), target) - lower_bound(sums1_2.begin(), sums1_2.end(), target);
            }
        }

        return count;
    }
};
