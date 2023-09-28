// Day64_Q2.java
// Write a program to reverse a number using for recursion.
import java.util.Scanner;
public class reverse_a_number_recursion {
    static int rev = 0;
    static int rev(int num){
        if(num>0){
            rev = rev*10 + num%10;
            rev(num/10);
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(rev(num));
    }
}
