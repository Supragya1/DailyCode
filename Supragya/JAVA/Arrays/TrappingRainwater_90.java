// Day6_Q2.java
// TrappingRainwater_90
// Time complexity is O(N)
// Space complexity is O(N)
import java.util.Scanner;

public class TrappingRainwater_90{

public static void main(String []args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n = scan.nextInt();
    int a[]= new int[n];
    System.out.println("Enter the elements of array");
    for(int i=0;i<n;i++){
        a[i]= scan.nextInt();
    }
    int water_level =0;
    int total_water=0;
    int left[]=new int[n];
    int right[]=new int [n];
    // right max boundary array
    right[n-1] = a[n-1];
    for(int i=n-2;i>=0;i--){
            right[i]= Math.max(right[i+1], a[i]);
        }
    // left max boundary array
    left[0]=a[0];
    for(int i=1;i<n;i++){
           left[i]= Math.max(left[i-1],a[i]);
        }
    // water level and total water
        for (int i = 0; i < n; i++) {
            water_level = Math.min(left[i],right[i]);
            total_water += water_level - a[i];
        }
    System.out.println("Total water trapped = "+total_water);
    }
}
