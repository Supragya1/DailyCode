// Day45_Q1.java
// ternaryoperator_23.java
import java.util.*;
public class ternaryoperator_23 {
    public static void main(String[]ags){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scan.nextInt() ;
        String oddoreven = (number%2==0)?"even":"odd";
        System.out.println(oddoreven);
    }
}
