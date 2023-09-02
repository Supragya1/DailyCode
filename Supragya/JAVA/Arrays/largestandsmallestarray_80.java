// Day7_Q3.java
// largestandsmallestarray_80
import java.util.*;
public class largestandsmallestarray_80{
    public static int largest(int numbers[],int n){
        int largest =numbers[0];
           for(int i=0;i<n;i++){
            if(largest<numbers[i])
            largest= numbers[i];
           }
           return largest;
    }
    public static int smallest(int numbers[],int n){
        int smallest = numbers[0];
        for(int i=0;i<n;i++){
        if(smallest>numbers[i]){
           smallest = numbers[i];
        }
    }
        return smallest;
    }
     public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enthe the size of array");
        int n = scan.nextInt();
        System.out.println("Enter the elements of array");
        int numbers[]= new int[n];
        for(int i=0;i<n;i++){
             numbers[i]= scan.nextInt();
        }
        System.out.println("Array elements are : ");
        for(int i=0;i< numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println("\nlargest value is "+largest(numbers,n));
        System.out.println("Smallest value is "+smallest(numbers,n));
     }
}
