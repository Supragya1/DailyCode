// Day79_Q1.java
// Java Int to String
import java.io.*;
import java.util.*;

public class java_int_to_string {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int a= scan.nextInt();
       String s = Integer.toString(a);
       //String s = String.valueOf(a);
       if(s!=null){
           System.out.println("Good job");
       }
       else{
           System.out.println("Wrong answer");
       }
    }
}