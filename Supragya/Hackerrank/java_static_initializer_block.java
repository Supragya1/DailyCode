// Day78_Q1.java
// Jaava static initializer block Hackerrank
import java.io.*;
import java.util.*;

public class java_static_initializer_block {
    static{
        Scanner scan = new Scanner(System.in);
        try{
        int b = scan.nextInt();
        int h = scan.nextInt();
        if(b>0&&h>0){
            int area = b*h;
            System.out.println(area);
        }
        else{
            throw new Exception("java.lang.Exception: Breadth and height must be positive");
        }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    public static void main(String[] args) {
        
    }
}