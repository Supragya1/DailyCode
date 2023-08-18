//InvertedandRotatedHalfPyramid_65
import java.util.*;
public class InvertedandRotatedHalfPyramid_65{
      public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = scan.nextInt();

        for(int i=1;i<=rows;i++){

            for(int j=1;j<=rows-i;j++){
              System.out.print(" ");}

                  for(int k=1;k<=i;k++){
                    System.out.print("*");}

            System.out.println();
        }
      }
}
