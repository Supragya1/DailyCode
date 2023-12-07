// https://leetcode.com/problems/search-a-2d-matrix-ii/


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int down = 0, left = matrix[0].length-1;

        while (down < matrix.length && left >= 0) {
            if (matrix[down][left] == target) {
                return true;
            }
            else if (matrix[down][left] < target) {
                down++;
            }
            else {
                left--;
            }
        }

        return false;
    }
}