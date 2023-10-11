// Day77_Q1.java
// Java Loops II Hackerrank
import java.util.*;
import java.io.*;
public class java_loops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int j=0;j<t;j++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
                    int sum = 0;

        sum = a + (1 * b);
        System.out.print(sum+" ");
        int p = 2;
        for (int i = 2; i <= n; i++) {
            sum += (p * b);
            System.out.print(sum+" ");
            p = p * 2;
        }
        System.out.println();

    }   
        in.close();
    }
}
