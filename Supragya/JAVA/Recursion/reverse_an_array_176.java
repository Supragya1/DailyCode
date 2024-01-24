// Day131_Q2.java
import java.util.Scanner;
public class reverse_an_array_176 {
    public static void reverse(int[] arr,int index){
        if(index==arr.length-1){
            return;
        }
        int temp = arr[index];
        arr[index]= arr[arr.length-1-index];
        arr[arr.length-1-index]=temp;
        reverse(arr, index+1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=scan.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("The array after reversing is: ");
        reverse(arr,0);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
