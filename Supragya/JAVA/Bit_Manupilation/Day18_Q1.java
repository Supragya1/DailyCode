// ClearLast_ithBit_120
import java.util.Scanner;

public class ClearLast_ithBit_120 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = scan.nextInt();
        System.out.println("Enter till which bit you clear");
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
        a=a&(~(1<<i));
        }
        // or a=a&((~0)<<n);
        System.out.println("Number after clearing = "+a);
    }
}
