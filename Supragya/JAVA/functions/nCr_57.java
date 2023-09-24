// Day60_Q1.java
// nCr_57.java
import java.util.*;
public class nCr_57 {

    public static int factorial(int num){
        int factorial =1;
        for(int i=1;i<=num;i++){
            factorial *= i;}
            return factorial;
        } 

    public static int nCr(int n , int r){
        int nCr = (factorial(n))/((factorial(r))*factorial((n-r)));
        return nCr;
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scan.nextInt();
        System.out.println("Enter the value of r");
        int r = scan.nextInt();
        int solution = nCr(n,r);
        System.out.println(solution);
    }
}
