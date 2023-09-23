// Day59_Q2.java
// factorial_56.java
import java.util.*;
public class factorial_56 {
    public static int factorial(int num){
        int factorial =1;
        for(int i=1;i<=num;i++){
            factorial *= i;}
            return factorial;
        } 
    
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
      int a= scan.nextInt();
      System.out.println(factorial(a));
    }
}
