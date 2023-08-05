//MaxSubarray87
// Brute Force Method
import java.util.*;
public class MaxSubarray87 {
    public static void Maxsubarray(int a[]){
        int n =a.length;
        int sum=0,max=a[0];
          for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum+=a[j];
                if(max<sum){
                    max=sum;    
                }
            }
            sum=0;
          } 
          System.out.println(max);
    }
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = scan.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        Maxsubarray(a);
    }
}
