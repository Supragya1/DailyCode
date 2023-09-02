// Day4_Q2.java
// printsubarray_86
import java.util.*;
public class printsubarray_86 {
    public static void subArray(int a[],int n){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("(");
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(a[k]+" ");
                    sum+=a[k];
                }
                System.out.println(") sum = "+sum);
                count++;
            }
            System.out.println("");
        }
        System.out.println("Total subarrays = "+count);
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
        subArray(a,n);
    }
}
