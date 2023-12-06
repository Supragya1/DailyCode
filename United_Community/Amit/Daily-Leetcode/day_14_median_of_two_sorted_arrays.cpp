//Try-1
class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        vector<int> res;
        double ans;
        int i = 0, j = 0, k = 0;
        while (i != nums1.size() && j!= nums2.size()) {
            if (nums1[i] < nums2[j]) {
                res.push_back(nums1[i]);
                i++;
            }
            else if (nums1[i] > nums2[j]) {
                res.push_back(nums2[j]);
                j++;
            }
            else {
                res.push_back(nums1[i]);
                i++;
                res.push_back(nums2[j]);
                j++;
            }
        }
        while (i < nums1.size()) {
            res.push_back(nums1[i]);
            i++;
        }
        while (j < nums2.size()) {
            res.push_back(nums2[j]);
            j++;
        }
        //cout << (res[res.size() / 2 - 1] + res[res.size() / 2]);
        if (res.size() % 2 == 0) {
            ans = (double)(res[res.size() / 2 - 1] + res[res.size() / 2]) / 2.0;
        }
        else {
            ans = (double)res[res.size() / 2];
        }
        return ans;
    }
};

//Try-2 - Even more time
// class Solution {
// public:
//     double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
//         vector<int> res;
//         double ans;
//         for(int i = 0; i < nums1.size(); i++) {
//             res.push_back(nums1[i]);
//         }
//         for (int i = 0; i < nums2.size(); i++) {
//             res.push_back(nums2[i]);
//         }
//         sort(res.begin(), res.end());
//         if (res.size() % 2 == 0) {
//             ans = (double)(res[res.size() / 2 - 1] + res[res.size() / 2]) / 2.0;
//         }
//         else {
//             ans = (double)res[res.size() / 2];
//         }
//         return ans;
//     }
// }; 