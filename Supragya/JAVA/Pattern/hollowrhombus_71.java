// Day26_Q2.java 
// hollowrhombus_71 
import java.util.*;
public class hollowrhombus_71 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows= scan.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=rows;j++){
                if(i==1||i==rows||j==1||j==rows){
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
    }
}
}
