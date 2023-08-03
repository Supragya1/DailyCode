// Bubblesort_92
// 5 4 3 2 1   
// 4 5 3 2 1
// 4 3 5 2 1 
// 4 3 2 5 1
// 4 3 2 1 5 and so on (largest move to last and again from start)
// Time Complexity O(N^2);
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
 
