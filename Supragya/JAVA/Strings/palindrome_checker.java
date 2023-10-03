// Day69_Q2.java
// Write a program to find if a given string is a palindrome or not.
import java.util.*;
public class palindrome_checker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = scan.nextLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) !=s.charAt(s.length()-1-i)){
                System.out.println("The string is not a palindrome.");
                return;
            }
        }
        System.out.println("The string is a palindrome.");
    }
}