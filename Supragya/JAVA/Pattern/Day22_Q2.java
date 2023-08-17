// characterpattern_52
import java.util.*;
public class characterpattern_52 {
   public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    char ch = 'A';
  int n = scan.nextInt();
    for (int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
            System.out.print(ch);
            ch++;
         }
         System.out.println();
    }
   }
}
