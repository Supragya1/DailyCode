// Day69_Q1.java
// Write a program to find how many times a given string appears in a given sentence as a substring.
import java.util.*;
public class a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String s = scan.nextLine();
        System.out.println("Enter the string to be searched: ");
        String s1 = scan.nextLine();
        int count = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == s1.charAt(0)) {
                int j = 0;
                while(j<s1.length() && i+j<s.length() && s.charAt(i+j) == s1.charAt(j)) {
                    j++;
                }
                if(j == s1.length()) {
                    count++;
                }
            }
        }
        System.out.println("The string appears "+count+" times in the sentence.");
        
    }
}
