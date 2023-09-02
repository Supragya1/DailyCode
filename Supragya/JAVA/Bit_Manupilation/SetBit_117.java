// Day16_Q2.java
// SetBit_117
// set means 1
import java.util.Scanner;

public class SetBit_117 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = scan.nextInt();
        System.out.println("Enter which bit you wanna Set");
        int n = scan.nextInt();
        a=a|(1<<n);
        System.out.println("Number after setting = "+a);
    }
}
