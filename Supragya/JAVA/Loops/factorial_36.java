// Day51_Q2.java
// factorial_36.java
import java.util.*; 
public class factorial_36 {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the range of numbers you wanna add n = ");
    int n =scan.nextInt(), factorial=1,i;
    for(i=1;i<=n;i++)
    {
        factorial *= i;
    }
    System.out.println( factorial);
    }
}
