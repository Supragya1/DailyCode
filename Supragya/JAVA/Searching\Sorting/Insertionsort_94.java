// Day10_Q1.java
// Insertionsort_94
// Time Complexity O(N^2);
// Space Complexity O(1)
// pick an element from unsorted part and put it in right position in sorted part
// 12 11 13 5 6
// 11 12 13 5 6
// 11 12 13 5 6
// 11 12 5 13 6      11 5 12 13 6     5 11 12 13 6  
// 5 11 12 6 13       5 11 6 12 13     5 6 11 12 13
import java.util.Scanner;

public class Insertionsort_94 {
    public static void Insertionsort(int a[]){
        int n=a.length;
       for(int i=1;i<n;i++){
        int key =a[i];
        int j=i-1;
        while (j>=0 && key<a[j] ) {
            a[j+1]=a[j];
            j--;
        }
            a[j+1]=key;
       }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String []args){
         Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n =scan.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        Insertionsort(a);
    }
}
