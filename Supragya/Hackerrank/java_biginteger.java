// Day93_Q1.java
// Java BigInteger HackerRank
import java.util.*;
import java.math.*;
public class java_biginteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = new BigInteger(scan.nextLine());
        BigInteger b = new BigInteger(scan.nextLine());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}