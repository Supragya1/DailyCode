// Day46_Q1.java
// switchcase_25.java
import java.util.*;
public class switchcase_25 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
       System.out.println("enter any alphabet in lower case");
        char vowel = scan.next().charAt(0);
        switch(vowel){
        case 'a': System.out.println("It's an vowel");
        break;
        case 'e': System.out.println("It's an vowel");
        break; 
        case 'i': System.out.println("It's an vowel");
        break;
         case 'o': System.out.println("It's an vowel");
        break;
         case 'u': System.out.println("It's an vowel");
        break;
        default :
        System.out.println("its a consonant");
        }
    }
}
