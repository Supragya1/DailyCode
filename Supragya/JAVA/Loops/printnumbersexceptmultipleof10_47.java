// Day57_Q1.java
// printnumbersexceptmultipleof10_47.java
import java.net.SocketTimeoutException;
import java.util.*;
public class printnumbersexceptmultipleof10_47 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.println("Enter the number");
        int num = scan.nextInt();
        if(num%10==0){
        continue;}
        System.out.println("Your number was " + num);
        
        }
}
}