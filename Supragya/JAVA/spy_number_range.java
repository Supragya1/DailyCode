// Day65_Q2.java
// Write a program to show all the spy numbers between 1 and n.
import java.util.Scanner;
public class spy_number_range {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to show all the spy numbers between 1 and n");
        int n = scan.nextInt();
        for(int i = 1; i <= n; i++) {
            int num = i;
            int sum = 0, product = 1;
            while(num > 0) {
                int rem = num % 10;
                sum += rem;
                product *= rem;
                num /= 10;
            }
            if(sum == product) {
                System.out.print(i+" ");
            }
        }
    }
}
