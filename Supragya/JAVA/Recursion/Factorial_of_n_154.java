// Day106_Q1.java
import java.util.*;
public class Factorial_of_n_154 {
    public static int factorial(int n) {
        if(n==0){
            return 1;
        }
        int factorial_of_n_minus_1=factorial(n-1);
        int factorial_of_n= n * factorial_of_n_minus_1;
        return factorial_of_n;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scan.nextInt();
        //^ Recursion method
        long start = System.currentTimeMillis();
        System.out.println("Factorial of "+n+" is "+factorial(n));
        long end = System.currentTimeMillis();
        System.out.println("Time taken by recursion is : "+(end-start)+"ms");
        //^ Iteration method
        int factorial=1;
        start = System.currentTimeMillis();
        for(int i=1;i<=n;i++){
            factorial*=i;
        }
        System.out.println("Factorial of "+n+" is "+factorial);
        end = System.currentTimeMillis();
        System.out.println("Time taken by iteration is : "+(end-start)+"ms");
        
    }
}
