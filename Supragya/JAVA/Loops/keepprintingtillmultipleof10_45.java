// Day56_Q1.java
// keepprintingtillmultipleof10_45.java
import java.util.*;
public class keepprintingtillmultipleof10_45 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter the Number");
            int num = scan.nextInt();
            if(num%10==0){
                break;
            }
            System.out.println(num);
        }
    }
}
