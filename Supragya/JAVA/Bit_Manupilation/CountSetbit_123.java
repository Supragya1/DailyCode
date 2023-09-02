// Day19_Q2.java
// CountSetbit_123
import java.util.Scanner;

public class CountSetbit_123 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int a= scan.nextInt();
        int count=0;
        while(a>0){
            if((a&1)!=0){
                count++;
            }
            a=a>>1;
        }
        System.out.println("Number of set bits = "+count);
    }
}
