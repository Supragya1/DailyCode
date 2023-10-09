// Day75_Q2.java
// Java Stdin and Stdout II Hackerrank
import java.util.Scanner;
public class java_stdin_and_stdout2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();// This line is added to consume the leftover newline.
        String s = scan.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}