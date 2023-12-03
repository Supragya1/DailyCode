class Solution {
public:
    int search(vector<int>& nums, int target) {
        unordered_map<int, int> dict;
        for (int i = 0; i < nums.size(); ++i) {
            dict[nums[i]] = i;
        }

        sort(nums.begin(), nums.end());

        int high = nums.size() - 1, mid, low = 0, index = -1;

        while (high >= low) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                index = dict[nums[mid]];
                break;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return index;
    }
};

// class Solution {
// public:
//     int search(vector<int>& nums, int target) {
//         for(int i = 0; i < nums.size(); i++) {
//             if (nums[i] == target) {
//                 return i;
//             }
//         }
//     return -1;
//     }
// };