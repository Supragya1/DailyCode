// Day36_Q2.c
// StringCreation_102
// Strings are IMMUTABLE
import java.util.*;
public class StringCreation_102 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        char arr[] = {'T','a','r','u','n'};
        String str = "Supragya";
        String str2 = new String("Supro");
        String str4 = scan.nextLine(); // string with space
        String str3 = scan.next(); // single word
        char a = scan.next().charAt(0);
        
        // length of string    = name.length()   where as for array only name.length
        int length_str4 = str4.length(); 
        System.out.println(length_str4);
    }
}

