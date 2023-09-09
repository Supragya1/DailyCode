// Day45_Q2.java
// passorfail_24.java
import java.util.*;
public class passorfail_24 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = scan.nextInt();
        String status =(marks>=33)?"Pass":"Fail";
        System.out.println(status);
    }
}
