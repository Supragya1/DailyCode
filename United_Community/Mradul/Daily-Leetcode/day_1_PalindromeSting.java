import java.util.Scanner;

public class day_1_PalindromeSting {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int right = s.length() - 1, left = 0;
        while (left < right) {
            if (!((s.charAt(left) >= 'a' && s.charAt(left) <= 'z') || (s.charAt(left) >= '0' && s.charAt(left) <= '9'))) {
                left++;
            } else if (!((s.charAt(right) >= 'a' && s.charAt(right) <= 'z') || (s.charAt(right) >= '0' && s.charAt(right) <= '9'))) {
                right--;
            } else {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                right--;
                left++;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;

        System.out.print("Enter The string : ");
        s = sc.next();
        System.out.print(isPalindrome(s));
    }
    
}