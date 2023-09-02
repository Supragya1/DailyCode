// Day18_Q2.java
// ClearRangeofBit_121
import java.util.Scanner;

public class ClearRangeofBit_121 {
     public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = scan.nextInt();
        System.out.println("Enter start of range");
        int start = scan.nextInt();
        System.out.println("Enter end of range");
        int end = scan.nextInt();
        for(int i=start;i<=end;i++){
        a=a&(~(1<<i));
        }
        // int b= ((~0)<<(end+1));
        // int c = (1<<start)-1;
        // a=a&(b|c);
        System.out.println("Number after clearing = "+a);
    }
}
