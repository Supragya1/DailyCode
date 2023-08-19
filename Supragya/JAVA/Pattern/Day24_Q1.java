// InvertedHalfPyraidwithNumbers_66
import java.util.*;
public class InvertedHalfPyraidwithNumbers_66 {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of rows");
    int rows = scan.nextInt();
    for(int i =0;i<rows;i++){
        for(int j=1;j<=rows-i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    }
}
