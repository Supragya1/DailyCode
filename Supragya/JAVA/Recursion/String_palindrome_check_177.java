// Day132_Q1.java
import java.util.Scanner;
public class String_palindrome_check_177 {
    public static boolean palindrome(String str,int i){
        if(i==str.length()/2){
            return true;
        }
        if(str.charAt(i)!=str.charAt(str.length()-1-i)){
            return false;
        }
        return palindrome(str, i+1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=scan.nextLine();
        System.out.println("The string is a palindrome: "+palindrome(str,0));    
    }
}
