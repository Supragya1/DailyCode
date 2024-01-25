// Day132_Q2.java
import java.util.Scanner;
public class Decimal_to_binary_178 {
    public static int decimalToBinary(int n){
        if(n==0){
            return 0;
        }
        System.out.println(n%2+" "+n/2);
        return n%2+10*decimalToBinary(n/2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int n=scan.nextInt();
        System.out.println("The binary equivalent of "+n+" is "+decimalToBinary(n));
    }
}
