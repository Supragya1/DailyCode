// Day126_Q2.java
// For a given integer array of size N. You have to find all the occurrences
// (indices) of a given element (Key) and print them. Use a recursive function to solve this problem.
import java.util.*;
public class Find_index_169 {
    static void findIndex(int[] arr, int i, int key){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
            findIndex(arr, i+1, key);
        }
        else{
            findIndex(arr, i+1, key);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int key = scan.nextInt();
        findIndex(arr,0,key);
    }
}
