// Day107_Q2.java
import java.util.Scanner;
public class array_sorted_157 {
    public static boolean isSorted(int[] arr,int index) {
        if(index== arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return isSorted(arr,index+1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Is array sorted? "+isSorted(arr,0));
    }
}
