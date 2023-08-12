// Update_ithBit_119
import java.util.Scanner;

public class Update_ithBit_119 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = scan.nextInt();
        System.out.println("Enter which bit you want to update");
        int n = scan.nextInt();
        System.out.println("Enter by what you want to update "+n+"th bit 0 or 1");
        int x = scan.nextInt();
        if(x==0){
        a=a&(~(1<<n));
    }
        else if(x==1){
           a= a|(1<<n); 
        }
        System.out.println("Number after updating = "+a);
    }
}
