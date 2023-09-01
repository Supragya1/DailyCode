// Day37_Q2.java
// CharAt_Method_104
import java.util.Scanner;
public class CharAt_Method_104 {
    public static void printletters(String full_name){
        for(int i=0;i<full_name.length();i++){
            System.out.print(full_name.charAt(i)+" ");
        }
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String first_name ="Supragya";
        String middle_name = "S ";
        String last_name = "Gandotra";
        String full_name = first_name+" "+middle_name+last_name;
        System.out.println(full_name.charAt(5));
        printletters(full_name);
    }
}
