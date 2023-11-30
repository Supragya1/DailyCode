// Binary Search with time complexity n(logm) and one if condition for better TC
// beats 85.34% runtime 5 ms
class Solution {
public boolean searchMatrix(int[][] matrix, int target) {
int row=matrix.length,col=matrix[0].length;
for(int i=0;i<row;i++){
if ((target >= matrix[i][0]) && (target <= matrix[i][col-1])) {
int left = 0,right=col-1;
while(left<=right){
int mid = left+(right-left)/2;
if(target==matrix[i][mid]){
return true;
}
else if(target>matrix[i][mid]){
left = mid+1;
}
else{
right =mid-1;
}
}
}
}
return false;
}
}
// Binary Search with Time Complexity Log(n*m)
// but in this question full 2d array is not sorted
class Solution {
public boolean searchMatrix(int[][] matrix, int target) {
if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
return false;
}
​
int rows = matrix.length;
int cols = matrix[0].length;
int left = 0;
int right = rows * cols - 1;
​
while (left <= right) {