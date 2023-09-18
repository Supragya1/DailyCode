// Day54_Q2.java
// palindrome_upto_range_n_42.java
import  java.util.*;
public class palindrome_upto_range_n_42 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the range till where you want the palindrome numbers = ");
        int range = scan.nextInt();
        int reverse=0,ld,count=0,i,num;
        for(i=0;i<=range;i++){
            num =i;
            while(num>0){
                ld = num%10;
                reverse = reverse*10+ld;
                num /= 10;
            }
            if(reverse == i){
            System.out.print(reverse+" ");
            count++;}
            reverse=0;
            
        }
       System.out.println("\nTotal number of palindrome numbers Present in range 0 to "+range+" is = " +count);
    }
}
