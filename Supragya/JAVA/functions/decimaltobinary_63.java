// Day63_Q1.java
// decimaltobinary_63.java
import java.util.*;
public class decimaltobinary_63 {
    public static int decimaltobinary(int num){
        int binary=0,pow=0;
        while(num>0){
            int rem = num%2;
            num/=2;
         binary += rem*Math.pow(10,pow);
         pow++;
        }
        return binary;
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int num = scan.nextInt();
        System.out.println(decimaltobinary(num));
        }
    }

