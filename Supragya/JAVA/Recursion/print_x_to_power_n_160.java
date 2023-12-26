// Day109_Q1.java
import java.util.Scanner;
public class print_x_to_power_n_160 {
    public static int power(int x,int n) {
        if(n==1){
            return x;
        }
        return x*power(x,n-1);
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
