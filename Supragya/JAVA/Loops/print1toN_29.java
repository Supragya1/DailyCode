// Day48_Q1.java
// print1toN_29.java
import java.util.*;
public class print1toN_29 {
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n = scan.nextInt();
    int count = 1;
    while(count<=n)
    {System.out.print(count+" ");
    count++;
    }
    }
}
