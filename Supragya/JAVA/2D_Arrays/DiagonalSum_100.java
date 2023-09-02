// Day14_Q1.java
// DiagonalSum_100
import java.util.Scanner;
public class DiagonalSum_100 {
    public static void DiagonalSum(int matrix[][]){
        int n=matrix.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=matrix[i][i];
            if(i!=n-1-i){
            sum+=matrix[i][n-1-i];
            }
        }
        System.out.println(sum);
    }
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
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
        DiagonalSum(matrix);
    }
}
