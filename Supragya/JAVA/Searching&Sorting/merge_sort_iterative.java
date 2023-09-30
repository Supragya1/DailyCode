// Day66_Q2.java
// Write a program to implement merge sort algorithm using iterative approach.
import java.util.*;
public class merge_sort_iterative {
    public static void merge_sort(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i=i*2){
            for(int j=0;j<n-1;j=j+2*i){
                int l = j;
                int m = Math.min(j+i-1,n-1);
                int r = Math.min(j+2*i-1,n-1);
                merge(arr,l,m,r);
            }
        }
    }
    public static void merge(int arr[],int l,int m,int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i=0;i<n1;i++){
            L[i] = arr[l+i];
        }
        for(int i=0;i<n2;i++){
            R[i] = arr[m+1+i];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        merge_sort(arr);
        System.out.println("The sorted array is");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
