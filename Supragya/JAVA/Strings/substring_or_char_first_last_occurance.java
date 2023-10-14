// Day71_Q2.java
// Write a program for searching strings for the first occurrence of a character or substring and for the 
// last occurrence of a character or substring. 
import java.util.*;
public class substring_or_char_first_last_occurance{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = scan.nextLine();
        System.out.println("Enter the character or substring to be searched");
        String s1 = scan.nextLine();
        System.out.println("First occurance of "+s1+" is at "+s.indexOf(s1));
        System.out.println("Last occurance of "+s1+" is at "+s.lastIndexOf(s1));
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == s1.charAt(0)) {
                int j = 0;
                while(j<s1.length() && i+j<s.length() && s.charAt(i+j) == s1.charAt(j)) {
                    j++;
                }
                if(j == s1.length()) {
                    System.out.println("The string appears at index "+i);
                }
            }
        }
    }
}