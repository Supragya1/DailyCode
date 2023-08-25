// Selectionsort_93
// pick the smallest from array and swap it in beginning
// 5 9 4 2 3 1
// 1 9 4 2 3 5 
// 1 2 4 9 3 5 
// 1 2 3 9 4 5 
// 1 2 3 4 9 5 
// 1 2 3 4 5 9 
import java.util.Scanner;

public class Selectionsort_93 {
    public static void Selectionsort(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[min]>a[j]){
                    min =j;
                }
            }
            int temp =a[min];
                a[min]=a[i];
                a[i]=temp;
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
        Selectionsort(a);
    } 
}
