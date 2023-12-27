// Day110_Q2.java
import java.util.*;
public class Sum_till_n_163 {
    public static int sum(int n) {
        if(n<=1){
            return 1;
        }
        int sum_minus1= sum(n-1);
        int sum = n+sum_minus1;
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=scan.nextInt();
        System.out.println("The sum of first "+n+" natural numbers is "+sum(n));   
    }
}
