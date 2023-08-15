// Swap2numbers
import java.util.*;
public class Swap2numbers {
    public static void Swap(int a,int b){
        a^=b;
        b^=a;
        a^=b;
        System.out.println("After swapping \na = "+a+" b = "+b);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of first number a = ");
        int a = scan.nextInt();
        System.out.println("Enter the value of second number b = ");
        int b = scan.nextInt();
        Swap(a,b);
    }
}
