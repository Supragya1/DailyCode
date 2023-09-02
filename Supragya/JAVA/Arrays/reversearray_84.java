// Day7_Q2.java
//reversearray_84
import java.util.*;
public class reversearray_84 {
    public static void Reverse(int a[]){
        int temp;
        for(int i=0;i<a.length/2;i++){
            temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
    }
    public static void main(String []args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = scan.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        Reverse(a);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
