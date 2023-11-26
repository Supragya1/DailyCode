#include <vector>

class Solution {
public:
    bool searchMatrix(std::vector<std::vector<int>>& matrix, int target) {
        int row = matrix.size();
        if (row == 0) {
            return false;
        }
        
        int col = matrix[0].size();

        int i = 0, j = col - 1; 

        while (i < row && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
};

// class Solution {
// public:
//     bool searchMatrix(vector<vector<int>>& matrix, int target) {
//         int row = matrix.size(), col = matrix[0].size();
//         for (int i = 0; i < row; i++) {
//             if ((target >= matrix[i][0]) && (target <= matrix[i][col-1])) {              
//                 int high = col - 1, low = 0;
//                 int flag = 0;
//                 while (high >= low) {
//                     int mid = low + (high - low)/2;
//                     if (matrix[i][mid] == target) {
//                         return true;
//                     }
//                     else if(target > matrix[i][mid]) {
//                         low = mid + 1;
//                     }

//                     else {
//                         high = mid - 1;
//                     }
//                 }
//                 if (flag == 0) {
//                     continue;
//                 }
//             }
//             else {
//                 continue;
//             }
//         }
//     return false;
//     }
// };