// Day108_Q2.java 
import java.util.*;
public class last_occurance_159 {
    public static int lastOccurance(int[] arr,int index,int target){
        if(index== arr.length-1){
            return -1;
        }
        int isFound =lastOccurance(arr, index+1, target);
        if(isFound ==-1 && arr[index] == target){
            return index;
        }
    else{
        return isFound;
    }
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
        if(lastOccurance(arr,0,x)==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element last occurance at index "+lastOccurance(arr,0,x));
        }
    }
}
