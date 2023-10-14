// Day72_Q1.java
// Write a program to reverse a string in same string variable.
import java.util.Scanner;
public class reverse_string2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        for(int i=0;i<str.length()/2;i++){
            char temp = str.charAt(i);
            str = str.substring(0,i)+str.charAt(str.length()-i-1)+str.substring(i+1,str.length()-i-1)+temp+str.substring(str.length()-i,str.length());
        }
        System.out.println("Reversed string: "+str);
    }
}
