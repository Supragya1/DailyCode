// Day12_Q2.java
// SearchElement_97
import java.util.Scanner;

public class SearchElement_97 {
    public static boolean search(int matrix[][],int x){
        int rows =matrix.length;
        int columns = matrix[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(x== matrix[i][j]){
                    System.out.println("Element found at row "+i+" column "+j +" = ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Element not found ");
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
        System.out.println("Enter the element you wanted to search");
        int x = scan.nextInt();
        search(matrix, x);
    }
}
