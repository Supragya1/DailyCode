// Day73_Q2.java
// make Heart pattern 
import java.util.Scanner;
public class Heart_pattern{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = scan.nextInt();
        for (int i = rows / 2; i <= rows; i += 2) {
            for (int j = 1; j < rows - i; j += 2)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");

            for (int j = 1; j <= rows - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }

        for (int i = rows; i >= 1; i--) {
            for (int j = i; j < rows; j++)
                System.out.print(" ");

            for (int j = 1; j <= (i * 2) - 1; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}