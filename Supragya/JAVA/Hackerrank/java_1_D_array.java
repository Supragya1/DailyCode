// Day83_Q1.java
// Java 1D Array HackerRank
import java.util.*;
public class java_1_D_array{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}