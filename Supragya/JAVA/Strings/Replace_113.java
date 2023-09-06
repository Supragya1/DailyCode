// Day42_Q1.java
// Replace_113.java
import java.util.*;

public class Replace_113 {
    public static void main(String[]args){
        String str1 = "My name is Supragya";
        System.out.println("str1 = "+str1);
        /*replace (char oldChar, char newchar) 
        Returns a new string resulting from replacing all occurrences of oldchar in this string with newchar*/
        String str2 = str1.replace('a',' ');
        System.out.println("str2 = "+str2);
        str2 = str1.replace("a","");
        System.out.println("str2 = "+str2);
        /*replace(CharSequence target, CharSequence replacement)
        Replaces each substring of this string that matches the literal target sequence with the 
        specified literal replacement sequence*/

        String str3 = str1.replace("My","Mera");
        System.out.println("str3 = "+str3);

        /*replaceAll(String regex, string replacement)
        Replaces each substring of this string that matches the given regular expression with the given replacement */
        String str4 = str1.replaceAll("My","Mera");
        System.out.println("str4 = "+str4);
        /*replaceFirst(String regex, String replacement
        Replaces the first substring of this string that matches the given regular expression with the given replacement */
        String str5 = str1.replaceFirst("a"," ");
        System.out.println("str5 = "+str5);
    }
}
