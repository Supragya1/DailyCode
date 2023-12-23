// Day105_Q2.java
import java.util.*;
public class Print_numbers_1_to_n_153 {
    public static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scan.nextInt();
        print(n);
    }
}
