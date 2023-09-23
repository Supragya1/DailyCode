// Day59_Q1.java
// product_55.java
import java.util.*;
public class product_55 {
    public static int multiply(int num1,int num2){
        int product = num1*num2;
        return product;
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a =scan.nextInt();
        int b = scan.nextInt();
       int product = multiply(a,b);
        System.out.println(product);
    }
}
