// Day53_Q2.java
//reverse_a_given_number_40.java
import java.util.*;
public class reverse_a_given_number_40 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want to reverse n = ");
        int n = scan.nextInt(),reverse = 0;
        while(n>0){
            int lastdigit = n%10;
            reverse = reverse*10+lastdigit;// to save reversed number
            //System.out.print(lastdigit); to print the reversed number
            n/=10;
        }
        System.out.println(reverse);
    }
}
