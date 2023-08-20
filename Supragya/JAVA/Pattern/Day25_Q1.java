// Trinagle0_1_68
import java.util.*;
public class Trinagle0_1_68 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                System.out.print("1");}
                else
                System.out.print("0");
            }
            System.out.println();
        }
    }
}
