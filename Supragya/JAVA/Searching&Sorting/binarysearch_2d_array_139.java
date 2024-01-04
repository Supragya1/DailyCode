// Day116_Q1.java
// Time Complexity: O(log(m*n)) where m is the number of rows and n is the number of columns
// Space Complexity: O(1)
// we imagine the 2D array as a 1D array so right = total number of elements -1(lenght of 1d array)
// to find the mid value of 2d array the formula is mid/columns and mid%columns
import java.util.*;
public class binarysearch_2d_array_139 {
    public static void BinarySearch_2d(int matrix[][],int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int left =0;
        int right = rows*columns-1; // we imagine the 2D array as a 1D array so right = total number of elements -1(lenght of 1d array)
        while(left<=right){
            int mid = left+ (right-left)/2;
            int midvalue = matrix[mid/columns][mid%columns];//to find the mid value of 2d array the formula is mid/columns and mid%columns
            if(midvalue==target){
                System.out.println("Element found at index "+mid/columns+" "+mid%columns);
                return;
            }
            else if(midvalue<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        System.out.println("Element not found");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the rows of 2D Array");
        int rows = scan.nextInt();
        System.out.println("Enter the columns of 2D Array");
        int columns = scan.nextInt();
        int matrix[][] = new int [rows][columns];
        System.out.println("Enter the elements of 2D array in sorted manner");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Enter the number to be found");
        BinarySearch_2d(matrix,scan.nextInt());
    }
}
