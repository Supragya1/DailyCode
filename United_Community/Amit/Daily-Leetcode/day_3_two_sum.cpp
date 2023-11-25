class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> ans;
        for (int i = 0; i < nums.size()-1; i++) {
            for (int j = i+1; j < nums.size(); j++) {
                    if (((nums[i] + nums[j]) == target) && (i != j)) {
                        ans.push_back(i);
                        ans.push_back(j);
                        break;
                    
                }
            }
        }
    return ans;
    }
};

// class Solution {
// public:
//     vector<int> twoSum(vector<int>& nums, int target) {
//         vector<int> ans;
//         for (int i = 0; i < nums.size(); i++) {
//             int search = target - nums[i];
//             vector<int> nums_copy(nums);
//             sort(nums_copy.begin(), nums_copy.end());

//             int low = 0, high = nums.size() - 1;
//             while (low <= high) {
//                 int mid = low + (high - low) / 2;
//                 if (nums_copy[mid] == search) {
//                     for (int j = 0; j < nums.size(); j++) {
//                         if (nums[j] == search && j != i) {
//                             ans.push_back(i);
//                             ans.push_back(j);
//                             break;
//                         }
//                     }
//                     break;
//                 } else if (search > nums_copy[mid]) {
//                     low = mid + 1;
//                 } else {
//                     high = mid - 1;
//                 }
//             }
//             if (!ans.empty()) {
//                 break;
//             }
//         }
//         return ans;
//     }
// }; //Works but time complexity too high

