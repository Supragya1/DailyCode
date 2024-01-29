// Day134_Q1.java
import java.util.Scanner;
public class Print_all_combinations_of_number_without_dublicates180 {
    public static void generatePermutations(int number) {
        String numStr = String.valueOf(number);
        generatePermutationsHelper("", numStr);
    }

    private static void generatePermutationsHelper(String prefix, String remaining) {
        int n = remaining.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutationsHelper(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1, n));
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=scan.nextInt();
        generatePermutations(n);
    }
}
