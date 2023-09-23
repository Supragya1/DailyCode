// Day58_Q2.java
// functionwithparameters_54.java
import java.util.*;
public class functionwithparameters_54 {
    public static int sum(int num1,int num2){
       int sum =num1+num2;
       return sum;
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();
       int sum = sum(a,b);
        System.out.println(sum);
    }
}
