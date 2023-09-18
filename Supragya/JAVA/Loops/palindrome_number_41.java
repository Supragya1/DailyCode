// Day54_Q1.java
// palindrome_number_41.java
import java.util.*;
public class palindrome_number_41 { // whether a number is palindrome or note
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number n =");
        int number = scan.nextInt(),lastdigit,reverse=0;
        int n =number; 
        /* why take n because if we compare number in if else value of number has changed in loop but for palindrome we 
            need to compare given number and reverse number (ie number==reverse ) but number has changed in loop so before loop we 
               take n = number so that we can compare n insted of number after loop*/
        while(number>0){
            lastdigit = number%10;
            reverse = reverse*10+lastdigit;
            number/=10;
        }System.out.println(reverse);
        if(n==reverse)
        System.out.println("Its a palindrome");
        else
        System.out.println("It's not a palindrome");
    }
}
