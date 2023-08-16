// invertedstarpattern_50
import java.util.*;
public class invertedstarpattern_50 {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
        for(int i =1;i<=n;i++){

            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
