// Day97_Q1.java
// Java Primality Test Hackerrank
import java.math.*;
import java.util.*;
import java.io.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class java_primality_test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        bufferedReader.close();
        BigInteger a = new BigInteger(n);
        System.out.println(a.isProbablePrime(1)?"prime":"not prime");
    }
}
