// Day106_Q1.java
//StairCase Search
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