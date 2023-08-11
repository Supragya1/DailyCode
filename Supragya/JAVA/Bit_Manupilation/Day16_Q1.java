// GetBit_116
// Get ith bit
import java.util.Scanner;
public class GetBit_116 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = scan.nextInt();
        System.out.println("Enter which bit you want");
        int n = scan.nextInt();
        a= a>>n; // if(a&(1<<n)==0)
        if((a&1)==0){
            System.out.println(n+"th bit is "+ 0);
        }
        else{
            System.out.println(n+"th bit is "+ 1);
        }
    }
}
