// Day110_Q1.java
// write a program to find the number of ways to tile a 2*n board with 2*1 tiles
import java.util.Scanner;
public class Tiling_problem_162 {
    public static int tiling(int n){
        if(n<=1){
            return 1;
        }
        int vertical = tiling(n-1);
        int horizontal = tiling(n-2);
        return vertical+horizontal;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=scan.nextInt();
        System.out.println("The number of ways to tile a 2 * "+n+" board with 2*1 tiles is "+tiling(n));
    }
}
