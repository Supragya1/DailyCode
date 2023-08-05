//TrappingRainwater_89
// Time complexity is O(N^2)
// Space complexity is O(1)
import java.util.Scanner;

public class TrappingRainwater_89{
    public static int rt_max(int a[],int index){
        int rt_max=a[0];
        for(int i=0;i<=index;i++){
            if(rt_max<a[i]){
                rt_max=a[i];
            }
        }
        return rt_max;
    }

public static int lt_max(int a[],int index){
        int lt_max=a[index];
        int n= a.length;
        for(int i=index;i<n;i++){
            if(lt_max<a[i]){
                lt_max=a[i];
            }
        }
        return lt_max;
    }
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
    for(int i=0;i<n;i++){
        water_level=Math.min(rt_max(a, i),lt_max(a, i));
        total_water+=water_level-a[i];
    }
    System.out.println("Total water trapped = "+total_water);
    }
}
