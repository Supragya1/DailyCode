// Day105_Q1.java
import java.util.*;
public class Print_numbers_n_to_1_152 {
    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        print(n-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scan.nextInt();
        print(n);
    }
}
