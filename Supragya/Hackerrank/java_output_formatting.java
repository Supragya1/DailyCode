// Day76_Q1.java
// Java Output Formatting Hackerrank
import java.util.Scanner;

public class java_output_formatting{

    public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=scan.next();
                int x=scan.nextInt();
                System.out.printf("%-15s%03d\n",s1,x);// here %-15 means left aligned and 15 is the minimum width of the string s for string %03d means minimum 3 digit integer.
            }
            System.out.println("================================");
    }
}



