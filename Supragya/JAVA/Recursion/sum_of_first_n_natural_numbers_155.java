// Day106_Q2.java
import java.util.Scanner;
public class sum_of_first_n_natural_numbers_155 {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int sum_n_minus_1 =sum(n-1);
        int sum = n+ sum_n_minus_1;
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scan.nextInt();
        //^ Recursion method
        long start = System.currentTimeMillis();
        System.out.println("Sum of first "+n+" natural numbers is "+sum(n));
        long end = System.currentTimeMillis();
        System.out.println("Time taken by recursion is : "+(end-start)+"ms");
        //^ Iteration method
        int sum=0;
        start = System.currentTimeMillis();
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum of first "+n+" natural numbers is "+sum);
        end = System.currentTimeMillis();
        System.out.println("Time taken by iteration is : "+(end-start)+"ms");

    }
}
