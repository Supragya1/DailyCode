// Day130_Q1.java
import java.util.Scanner;
public class Sum_till_nth_fibonacci_number_174 {
    public static long fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static long fibsum(int n,long sum){
        if(n<=0){
            return 0;
        }
        sum = fib(n);
        return sum+fibsum(n-1, sum);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scan.nextInt();
        System.out.println("RECURSIVE METHOD");
        System.out.println("The sum of first "+n+" fibonacci numbers is "+fibsum(n,0));
        System.out.println("ITERATIVE METHOD");
        int a=1,b=1,c=0;
        System.out.print("The fibonacci series is: ");
        int sum1=0;
        for(int i=0;i<n;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.print(c+" ");
            sum1+=c;
        }
        System.out.println("\nThe "+n+"th fibonacci number is "+c);
        System.out.println("The sum of first "+n+" fibonacci numbers is "+sum1);
    }
}
