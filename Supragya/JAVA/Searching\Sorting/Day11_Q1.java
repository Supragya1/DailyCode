// StaircaseSearch_101
// matrix is sorted both row and   column wise
// 10 20 30 40
// 15 25 35 45
// 27 29 37 48
// 32 33 39 50
// in staircase search always start from(n-1,0) or (0,m-1)
// if key< (m-1,0)(32) move top and if key> (m-1,0)move right
// if key< (0,n-1)(40) move left and if key> (0,n-1)move bottom
import java.util.Scanner;

public class StaircaseSearch_101 {
    public static boolean Staircasesearch(int matrix [][],int key){
        int rows =0,column = matrix[0].length-1;
        while(rows<matrix.length && column>=0){
            if(key == matrix[rows][column]){
                System.out.println("Element found at index ("+rows+","+column+")");
                return true;
            }
            if(key>matrix[rows][column]){
                rows++;
            }
            if(key<matrix[rows][column]){
                column--;
            }
            }
            System.out.println("Element not found");
            return false;
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
        Staircasesearch(matrix,3);
    }
}
