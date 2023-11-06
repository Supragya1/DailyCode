// Day90_Q1.java
// Java Exception Handling (Try-catch) Hackerrank
import java.util.*;
public class java_exception_handling1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;
        try{
            a= scan.nextInt();
            b= scan.nextInt();
            System.out.println((a/b));
        }
        catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}