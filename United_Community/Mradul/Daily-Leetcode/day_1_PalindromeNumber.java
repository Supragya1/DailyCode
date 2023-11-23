import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int sum = 0, temp = x;
        
        if (x < 0) {
            return false;
        }
        while (temp != 0) {
            sum = temp % 10 + sum*10;
            temp /= 10;
        }
        return (x == sum);
    } 
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter a number : ");
        n = sc.nextInt();

        System.out.println(isPalindrome(n));
    }
}