// Max_Min_98
import java.util.Scanner;

public class Max_Min_98 {
    public static int MAX(int matrix[][]){
        int rows =matrix.length;
        int columns = matrix[0].length;
        int max =matrix[0][0];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(max< matrix[i][j]){
                    max = matrix[i][j];
                }
            }
        }
      return max;  
    }

    public static int MIN(int matrix[][]){
        int rows =matrix.length;
        int columns = matrix[0].length;
        int min =matrix[0][0];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(min > matrix[i][j]){
                    min = matrix[i][j];
                }
            }
        }
      return min;  
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
        int max =MAX(matrix);
        int min =MIN(matrix);
        System.out.println("Maximum Element in matrix = "+max+" Minimum Element in matrix = "+min);
    }
}
