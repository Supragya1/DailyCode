// ClearBit_118
// clear means  setting 0;
import java.util.Scanner;

public class ClearBit_118 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = scan.nextInt();
        System.out.println("Enter which bit you clear");
        int n = scan.nextInt();
        a=a&(~(1<<n));
        System.out.println("Number after clearing = "+a);
    }
}
