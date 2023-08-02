// BuySellStock_91
import java.util.Scanner;

public class BuySellStock_91 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = scan.nextInt();
        int prices[] = new int[n];
        System.out.println("Enter the elemenets of array");
        for(int i =0;i<n;i++){
            prices[i]= scan.nextInt();
        }
       int buy_price =prices[0];
       int profit=0,max_profit=0;
       for(int i=0;i<n;i++){
        if(buy_price<prices[i]){
            profit=prices[i]-buy_price;
            max_profit=Math.max(profit,max_profit);
        }
        else{
            buy_price=prices[i];
        }
       }
       System.out.println("Maximum Profit = "+max_profit);
    }
}


/* time complexity O(N^2)
 public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = scan.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elemenets of array");
        for(int i =0;i<n;i++){
            a[i]= scan.nextInt();
        }
        int max= a[1]-a[0];
        for(int i=0;i<n;i++){
            for(int j= i+1;j<n;j++){
                if(max<a[j]-a[i]){
                    max =a[j]-a[i];
                }
            }
        }
        System.out.println("Maximum profit = "+max);
    } */
