// Day73_Q1.java
// make pattern
// ********
// ***  ***
// **    **
// *      *
// **    **
// ***  ***
// ********
import java.util.Scanner;   
public class space_diamond_or_4half_triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = scan.nextInt();
        for(int i=rows;i>=1;i--){
            for(int k=1;k<=i;k++){
                    System.out.print("*");}
            for(int j=1;j<=rows-i;j++){
              System.out.print(" ");}
                for(int j=1;j<=rows-i;j++){
              System.out.print(" ");}
                  for(int k=1;k<=i;k++){
                    System.out.print("*");}
            System.out.println();
        }
        for(int i=1;i<=rows;i++){
            for(int k=1;k<=i;k++){
                    System.out.print("*");}
            for(int j=1;j<=rows-i;j++){
              System.out.print(" ");}
                for(int j=1;j<=rows-i;j++){
              System.out.print(" ");}
                  for(int k=1;k<=i;k++){
                    System.out.print("*");}
            System.out.println();
        }
    }   
}
