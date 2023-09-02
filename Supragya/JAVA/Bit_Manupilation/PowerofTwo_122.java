// Day19_Q1.java
// PowerofTwo_122 
import java.util.Scanner;

public class PowerofTwo_122 {
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number to check");
        int a = scan.nextInt();
        if((a&(a-1))==0){
            System.out.println("Yes, Number is power of 2");
        }
        else{
             System.out.println("Number is not power of 2");
        }
    }
}
