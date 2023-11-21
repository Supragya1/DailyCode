// Day82_Q2.java
// Java Pattern Syntax Checker HackerRank
import java.util.*;
import java.util.regex.*;
public class Pattern_syntex_checker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        while(n!=0){
            String str = scan.nextLine();
            try {
                Pattern.compile(str);
                System.out.println("Valid");
            }
            catch(Exception e) {
                System.out.println("Invalid");
            }
            n--;
        }
    }
}
