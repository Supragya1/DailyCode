// Day133_Q1.java
import java.util.Scanner;
public class Binary_to_decimal_179 {
    public static int binaryToDecimal(int n){
        if(n==0){
            return 0;
        }
        return n%10+2*binaryToDecimal(n/10);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        int n=scan.nextInt();
        System.out.println("The decimal equivalent of "+n+" is "+binaryToDecimal(n));
    }
}
