// OddEven_115 
import java.util.Scanner;

public class OddEven_115 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = scan.nextInt();
        if((a&1) == 0){
            System.out.println(a+" is even");
        }
        else{
            System.out.println(a+" is odd");
        }
    }
}
