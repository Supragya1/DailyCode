// Given two integers, 'a' and 'b' as input, compute 'a/b.' If 'a' and 'b' are not signed integers
// or if 'b' is zero, an exception will occur.
import java.util.*;
public class MismatchArthimeticException{
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
        System.out.println("Enter the value of a");
        int a = scan.nextInt();
        System.out.println("Enter the value of b");
        int b = scan.nextInt();
        try{
            System.out.println("The value of a/b is "+(a/b));
        }
        catch(ArithmeticException e){
            System.out.println("The value of b is zero");
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        }
        catch(InputMismatchException e){
            System.out.println("The value of a or b is not an integer");
            System.out.println("java.util.InputMismatchException");
        }    
    }
}