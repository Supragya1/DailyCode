// Day81_Q1.java
// Java String Reverse Hackerrank 
import java.io.*;
import java.util.*;

public class java_string_reverse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int flag=0;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.println("No");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Yes");
        }
    }
}
