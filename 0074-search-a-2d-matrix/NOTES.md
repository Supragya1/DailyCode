// Binary Search
we can apply binary search here because 2d array is fully sorted
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
​
// Linear Search
class Solution {
public boolean searchMatrix(int[][] matrix, int target) {
for(int i=0;i<matrix.length;i++){
for(int j=0;j<matrix[0].length;j++){
if(matrix[i][j]==target){
return true;
}
}
}
return false;
}
}