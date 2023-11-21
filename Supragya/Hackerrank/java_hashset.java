// Day95_Q1.java
// Java HashSet HackerRank
import java.util.*;
public class java_hashset {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       HashSet<String> set = new HashSet<>();
       int n = scan.nextInt();
       scan.nextLine();
       for(int i=0;i<n;i++){
           set.add(scan.nextLine());
           System.out.println(set.size());
        } 
       
    }
}