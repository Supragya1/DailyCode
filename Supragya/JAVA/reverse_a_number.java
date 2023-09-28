// Day64_Q1.java
// Write a program to reverse a number using while loop.
import java.util.*;
public class reverse_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0;
        while(num>0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        System.out.println(rev);
    }
}