// Day58_Q2.java
// check_prime_48.java
import java.util.*;
public class check_prime_48 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num = scan.nextInt(),a=0;


        for(int i =2;i<num;i++){
           int x = num%i;
           if(x==0){
            System.out.println("Number is composite");
            a = 1;
            break;
           }
          
        }

        if(a!=1)
        System.out.println("Number is Prime");
       }
  }