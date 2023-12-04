// https://leetcode.com/problems/spiral-matrix/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int upper = 0, lower = matrix.length-1;
        int rigth = matrix[0].length-1, left = 0;

        while (rigth >= left && lower >= upper) {

            for (int j = left; j <= rigth; j++) {
                list.add(matrix[upper][j]);
            } // upper row

            for (int i = upper + 1; i <= lower; i++) {
                list.add(matrix[i][rigth]);
            } // rigth col
            
            if (upper < lower) {
                for (int j = rigth - 1; j >= left; j--) {
                    list.add(matrix[lower][j]);
                } // lower row
            }

            if (left < rigth) {
                for (int i = lower - 1; i > upper; i--) {
                    list.add(matrix[i][left]);
                } // left col
            }

            upper++;
            lower--;
            rigth--;
            left++;
        }

        return list;
    }
}