// Day106_Q2.java
// Stair Case Search
// here matrix is sorted row wise and column wise.
// so we start with arr[0][m-1] where m is number of col ie last element of 1st row
// if target is greater we move down ie row ++ and if target is small we go back in row ie col-
// or 
// we start with arr[n-1][0] where n is number of rows ie last element of 1st column
// if target is greater we move next ie col ++ and if target is small we go above in column ie row--
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row =matrix.length-1;
        int col = 0;
        while(row>=0 && col<matrix[0].length){
            if(target==matrix[row][col]){
                return true;
            }
            else if(target>matrix[row][col]){
                col++;
            }
            else{
                row--;
            }
        }
        return false;
    }
}