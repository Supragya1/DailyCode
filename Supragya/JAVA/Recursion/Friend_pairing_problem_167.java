// Day112_Q2.java
import java.util.*;
public class Friend_pairing_problem_167 {
    static int friendPairing(int n){
        if(n==1||n==2){
            return n;
        }
        int single = friendPairing(n-1);
        int pair = friendPairing(n-2);
        return single+(n-1)*pair;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of friends: ");
        int n = scan.nextInt();
        System.out.println("The number of ways in which "+n+" friends can remain single or can be paired up are: " + friendPairing(n));
    }
}
