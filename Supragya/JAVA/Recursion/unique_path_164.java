// Day111_Q1.java
// Write a function that takes n and m as input and outputs the number of unique paths from top to bottom right corner
// of n x m grid . And you can move down or right 1 unit at a time.
import java.util.*;
public class unique_path_164 {
    public static int unique_path(int n,int m){
        if(n==1||m==1){
            return 1;
        }
        return unique_path(n-1, m)+unique_path(n, m-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=scan.nextInt();
        System.out.print("Enter the value of m: ");
        int m=scan.nextInt();
        System.out.println("The number of unique paths from top to bottom right corner of "+n+" x "+m+" grid is "+unique_path(n,m));
    }
}
