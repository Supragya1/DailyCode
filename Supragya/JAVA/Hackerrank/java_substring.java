// Day80_Q1.java
// Java Substring Hackerrank
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class java_substring {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        int start = scan.nextInt();
        int end = scan.nextInt();
        System.out.print(S.substring(start,end));
    }
}