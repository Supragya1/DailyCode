// Day38_Q1.java
// Palindrome_String_105
import java.util.Scanner;

public class Palindrome_String_105 {
    public static boolean CheckPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                System.out.println("string is not palindrome");
                return false;
            }
            
        }
        System.out.println("String is Palindrome");
        return true;
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = scan.next();
        CheckPalindrome(str);
    }
}
