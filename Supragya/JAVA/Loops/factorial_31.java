// Day49_Q1.java
// factorial_31.java
import java.util.*;
public class factorial_31 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
      System.out.println("enter the Number you want the Factorial of n = ");
      int n = scan.nextInt();
      int i =1;
      int sum = 1;
       while(i<=n)
    {
        sum*=i;
        i++;
    }
    System.out.println(sum);
    }
}
