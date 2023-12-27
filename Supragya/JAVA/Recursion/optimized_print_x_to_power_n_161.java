// Day109_Q2.java
import java.util.Scanner;
public class optimized_print_x_to_power_n_161 {
    public static int power(int x,int n) {
        if(n==1){
            return x;
        }
        int half =power(x, n/2);
        if(n%2==0){
        return half*half;
        }
        else{
            return x*half*half;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x=scan.nextInt();
        System.out.print("Enter the value of n: ");
        int n=scan.nextInt();
        System.out.println("The value of "+x+" to the power "+n+" is "+power(x,n));
    }
}