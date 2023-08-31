
// starpatter1_49
import java.util.*;
public class starpatter1_49 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
 
