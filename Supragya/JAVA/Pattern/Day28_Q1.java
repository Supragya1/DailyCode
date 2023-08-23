// Palindromicpyramid_74
import java.util.*;
public class Palindromicpyramid_74 {
    public static void main(String[]args){
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the number of rows");
       int rows = scan.nextInt();
       for(int i=1;i<=rows;i++){
        for(int j=1;j<=rows-i;j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        for(int j =2;j<=i;j++){
            System.out.print(j);
        }
        
        System.out.println();
       }
    }
}
