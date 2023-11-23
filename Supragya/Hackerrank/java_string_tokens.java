// Day82_Q1.java
// Java String Tokens HackerRank
import java.io.*;
import java.util.*;

public class java_string_tokens {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String s = scan.nextLine();
       StringTokenizer st = new StringTokenizer(s," ,;'!.?_@");
       int count=0;
       StringBuffer sb = new StringBuffer();
       while(st.hasMoreTokens()){
           sb.append(st.nextToken());
           sb.append("\n");
           count++;
       }
       System.out.println(count);
       System.out.println(sb);
    }
}