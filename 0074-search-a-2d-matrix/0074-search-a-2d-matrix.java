// Day106_Q1.java
// in 2d binary search for finding midvalue fomula is arr[midindex/col][midindex%col]
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length,col = matrix[0].length;
        int left=0,right=rows*col-1;
        while(left<=right){
            int mid = left+ (right-left)/2;
            int midval = matrix[mid/col][mid%col];
            if(target==midval){
                return true;
            }
            if(target>midval){
                left = mid+1;
            }
            else{
                right =mid-1;
            }
        }
        return false;
    }
}