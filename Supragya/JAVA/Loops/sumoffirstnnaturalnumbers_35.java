// Day51_Q1.java
// sumoffirstnnaturalnumbers_35.java
import java.util.*;
public class sumoffirstnnaturalnumbers_35 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the range of numbers n =");
        int n = scan.nextInt(),i,sum=0;
        for(i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
