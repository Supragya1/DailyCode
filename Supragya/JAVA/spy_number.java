// Day65_Q1.java
// Write a program to accept a number and check and display whether it is a Spy Number or not.
// A number is called Spy number, if the sum and product of its digits are equal.
// Example: 1124 is a Spy number, sum of its digits is 1+1+2+4=8 and product of its digits is 1x1x2x4=8.
// Hence sum and product of its digits are equal.
import java.util.Scanner;
public class spy_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a Spy Number or not");
        int num = sc.nextInt();
        int sum = 0, product = 1;
        while(num > 0) {
            int rem = num % 10;
            sum += rem;
            product *= rem;
            num /= 10;
        }
        if(sum == product) {
            System.out.println("The number is a Spy Number");
        }
        else {
            System.out.println("The number is not a Spy Number");
        }
    }
}