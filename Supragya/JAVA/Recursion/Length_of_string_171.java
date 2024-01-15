// Day127_Q2.java
import java.util.Scanner;
public class Length_of_string_171 {
    static int length(String str){
        if(str.equals("")){
            return 0;
        }
        else{
            return 1+length(str.substring(1));
        }
    }
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String str = scan.nextLine();
    System.out.println("The length of the string is: "+length(str));
   } 
}
