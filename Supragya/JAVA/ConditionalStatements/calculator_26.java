// Day46_Q2.java
// calculator_26.java
import java.util.*;
public class calculator_26 {
    public static void main(String[]args){
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter the value of A");
   int A = scan.nextInt();
   System.out.println("Enter the value of B");
   int B = scan.nextInt();
   System.out.println("Enter the operator");
   char operator = scan.next().charAt(0);
   switch (operator){
    case '+' : System.out.println(A+B);
    break;
    case '-' : System.out.println(A-B);
    break;
    case '*' : System.out.println(A*B);
    break;
    case '/' : System.out.println(A/B);
    break;
    case '%' : System.out.println(A%B);
    break;
    default  : System.out.println("Select the right operator");
   }
    }
}
