// Day62_Q1.java
//rangeprime_61.java
import java.util.*;
public class rangeprime_61 {

    public static int prime(int num){
        int a=0;
        for(int i=2;i<num;i++){
            int x = num%i;
            if(x==0){
                a=1;
                break;
            }
        }
        return a;
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the range till where you want prime numbers");
        int range = scan.nextInt();
        for(int i=2;i<=range;i++){
            if(prime(i)==0){
                System.out.print(i+" ");
            }
        }

    }
}
