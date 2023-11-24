
public class day_1_PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int sum = 0;
        
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        
        while (x > sum) {
            sum = x % 10 + sum*10;
            x /= 10;
        }
        return ((x == sum) || (x==sum/10));
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter a number : ");
        n = sc.nextInt();

        System.out.println(isPalindrome(n));
    }
}