// Day9_Q1.java
// Bubblesort_92
// 5 4 3 2 1
// 4 5 3 2 1 
// 4 3 5 2 1 
// 4 3 2 5 1 
// 4 3 2 1 5 
// 3 4 2 1 5 
// 3 2 4 1 5 
// 3 2 1 4 5 
// 2 3 1 4 5 
// 2 1 3 4 5 
// 1 2 3 4 5 
//(largest move to last and again from start)
// Worst Time Complexity O(N^2);
// Average Time Complexity O(N^2);
// Best Time Complexity O(N)
// Space Complexity O(1)
import java.util.Scanner;

public class Bubblesort_92 {
    public static void Bubblesort(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp =a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
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
        Bubblesort(a);
    }
}
 
