// Day108_Q1.java
import java.util.Scanner;
public class first_occurance_158 {
    public static int firstOccurance(int arr[],int index,int target){
        if(index == arr.length-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return firstOccurance(arr, index+1, target);
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
        System.out.print("Enter the element to find: ");
        int x=scan.nextInt();
        if(firstOccurance(arr,0,x)==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element first occurance at index "+firstOccurance(arr,0,x));
        }
    }
}
