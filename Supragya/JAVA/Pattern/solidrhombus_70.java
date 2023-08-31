// Day26_Q1.java
//  solidrhombus_70
import java.util.*;
public class solidrhombus_70 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numer of rows");
        int rows = scan.nextInt();
        for(int i =1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=rows;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
