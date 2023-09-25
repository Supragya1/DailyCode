// Day61_Q1.java
// checkprime_60.java
import java.util.*;
public class checkprime_60 {

    public static void prime(int num){
        int a=0;
        for(int i=2;i<num;i++){
            int x = num%i;
            if(x==0){
                System.out.println("Number is composite");
                a=1;
                break;
            }
        }
            if(a!=1){
        System.out.println("Number is prime");}
        
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num = scan.nextInt();
        prime(num);
    }
}
