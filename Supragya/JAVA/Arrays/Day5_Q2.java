// MaxSubarray88
// KADANE'S ALGORITHM
import java.util.*;
public class MaxSubarray88 {
   public static void Kadane(int a[],int n){
    int curr=0,max=0;
    for(int i=0;i<n;i++){
        curr+=a[i];
        if(max<curr){
            max=curr;
        }
        else if(curr<0){
            curr=0;
        }
    }
    System.out.println("Max Sum = "+max);
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
        Kadane(a, n);
    }
}

