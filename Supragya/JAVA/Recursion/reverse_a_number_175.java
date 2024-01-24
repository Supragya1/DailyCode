// Day131_Q1.java
import java.util.Scanner;
public class reverse_a_number_175 {
    public static int reverse_using_log(int n){
        if(n<10){
            return n;
        }
        return  (n%10)*((int)Math.pow(10, (int)Math.log10(n)))+reverse_using_log(n/10);//(int)Math.log10(n) gives the number of digits in n-1 and (int)Math.pow(10, (int)Math.log10(n)) gives 10^(number of digits in n-1)
        }
    public static int reverse_using_count(int n){
        if(n<10){
            return n;
        }
        return  (n%10)*((int)Math.pow(10, count(n,0)-1))+reverse_using_count(n/10);
    }
    public static int count(int n,int counts){
        if(n<10){
            return counts+1;
        }
        return count(n/10,counts+1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=scan.nextInt();
        long start= System.currentTimeMillis();
        System.out.println("The reverse of the number "+n+" is "+reverse_using_log(n));
        long end= System.currentTimeMillis();
        System.out.println("Time taken by log method: "+(end-start)+"ms");
        start= System.currentTimeMillis();
        System.out.println("The reverse of the number "+n+" is "+reverse_using_count(n));
        end= System.currentTimeMillis();
        System.out.println("Time taken by count method: "+(end-start)+"ms");
        System.out.println(Math.pow(10, (int)Math.log10(999)));
        System.out.println((int)Math.log10(1000));
    }
}
