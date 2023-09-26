// Day62_Q2.java
// binarytodecimal_62.java
import java.util.*;
public class binarytodecimal_62 {

    public static int binarytodecimal(int num){
        int i=0,decimal=0;
       while(num>0){
        int ld = num%10;
        num /=10;
         decimal += (ld*Math.pow(2,i));
         i++;}
      return decimal;
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the binary number");
        int num = scan.nextInt();
        System.out.println(binarytodecimal(num));
    }
}
