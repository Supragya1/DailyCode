// Q2 Write a program to calculate the sum of the digits of a three-digit number entered by the user.
import java.util.Scanner;
public class Day1_Q2 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a three-digit number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int ld;
        while (number > 0) {
            ld = number % 10; 
            sum += ld;
            number /= 10; 
        }
        System.out.println("Sum of digits: " + sum);
    }
}
