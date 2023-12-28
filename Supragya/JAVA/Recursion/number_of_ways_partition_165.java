// Write a function that counts the number of ways you can partition n objects using parts up to m.
import java.util.Scanner;
public class number_of_ways_partition_165 {
    public static int partition(int n, int m){
        if(n==0){
            return 1;
        }
        if(m==0 || n<0){
            return 0;
        }
        return partition(n-m, m)+partition(n, m-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=scan.nextInt();
        System.out.print("Enter the value of m: ");
        int m=scan.nextInt();
        System.out.println("The number of ways to partition "+n+" objects using parts up to "+m+" is "+partition(n,m));
    }  
}
