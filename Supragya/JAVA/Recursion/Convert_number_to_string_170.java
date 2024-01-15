// Day127_Q1.java
// You are given a number (eg - 2019), convert it into a String of english like 
// “two zero one nine”. Use a recursive function to solve this problem.
import java.util.Scanner;
public class Convert_number_to_string_170 {
    static String[] digits ={"zero","one","two","three","four","five","six","seven","eight","nine"};
    static String convert(int n,String str){
        if(n==0){
            return str;
        }
        int ld = n%10;
        str = convert(n/10, str);
        str+=digits[ld]+" ";
        return str;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scan.nextInt();
        String str ="";
        System.out.println("The number in words is: "+convert(n,str));
    }
}
