// Day28_Q2.java
// right_angled_triangle
import java.util.Scanner;
public class Pattern{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2 * i - 1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
