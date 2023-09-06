// Day43_Q1.java
// maxof2_19.java
import java.util.*;
public class maxof2_19 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String S = "Enter 2 numbers";
        System.out.println(S);
        int A = scan.nextInt();
        int B = scan.nextInt();
        if(A>B)
        {
            System.out.println("A = " + A + " is the biggest number");
        }
        else if(A<B)
        {
            System.out.println("B = "+B +" is the biggest number");
        }
        else
        System.out.println("Both are same");
    }
}
