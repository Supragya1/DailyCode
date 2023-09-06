// Day42_Q2.java
// ifelse_18.java
import java.util.*;
public class ifelse_18 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        if(age>=18){
            System.out.println("You can drive and vote");
        }
       
        else{
            System.out.println("you are not an adult");
        } 
    }
}
