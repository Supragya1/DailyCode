// Day24_Q2
// FloydsTriangle_67
import java.util.*;
public class FloydsTriangle_67 {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of rows");
    int rows = scan.nextInt();
    for(int k=1, i=1;i<=rows;i++){
        
        for(int j=1;j<=i;j++){
            System.out.print(k+" ");
            k++;
        }
        System.out.println();
    }
    }
}
