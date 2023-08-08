// SpiralMatrix_99
//  n= length of rows,m= length of column
//  SR,SC 1 2 3 4  EC =m-1
//  =0    5 6 7 8
//        9 10 11 12
//       13 14 15 16 ER =n-1
        
import java.util.*;

public class SpiralMatrix_99 {
    public static void SpiralMatrix(int matrix[][]){
     int startRow=0,startCol=0;
     int endRow= matrix.length-1;
     int endCol =matrix[0].length-1;
        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            startRow++;
            //right
            for(int i=startRow;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            endCol--;
            //bottom
            if (startRow <= endRow) {
            for(int j=endCol;j>=startCol;j--){
                System.out.print(matrix[endRow][j]+" ");
            }
            endRow--;
            }
            // left
             if (startCol <= endCol) {
            for(int i=endRow;i>=startRow;i--){
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            }
            
        }
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the rows of 2D Array");
        int rows = scan.nextInt();
        System.out.println("Enter the columns of 2D Array");
        int columns = scan.nextInt();
        int matrix[][] = new int [rows][columns];
        System.out.println("Enter the elements of 2D array");
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
        SpiralMatrix(matrix);
    }
}

