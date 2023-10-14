// Day72_Q1.java
// Write a program to reverse a string.
import java.util.Scanner;
public class reverse_string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        String rev = "";
        for(int i=0;i<str.length();i++){
            rev += str.charAt(str.length()-i-1);
        }   
        System.out.println("Reversed string: "+rev);
    }
}
