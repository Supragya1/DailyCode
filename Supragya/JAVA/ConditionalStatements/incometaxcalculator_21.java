// DayQ44_Q1.java
// incometaxcalculator_21.java
import java.util.*;
public class incometaxcalculator_21 {
    public static void main(String[]args){
         
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Income");
        int Income = scan.nextInt();
        if(Income<= 500000)
        System.out.println("Your Tax is "+ Income*0 );
        else if (Income>500000 && Income<1000000)
        System.out.println("Your Tax is "+(Income-500000)*20/100);
        else
        System.out.println("Your Tax is "+ (Income-500000)*30/100);
    }
}
