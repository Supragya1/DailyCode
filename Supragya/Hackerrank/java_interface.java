// Day87_Q1.java
// Java Interface HackerRank 
import java.io.*;
import java.util.*;
interface AdvancedArithmetic{
    public int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
    MyCalculator(){
        System.out.println(this.getClass().getInterfaces()[0].getSimpleName());
    }
    int sum=0;
    @Override
    public int divisor_sum(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }    
}
public class java_interface {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print("I implemented: ");
        MyCalculator m1 =new MyCalculator();
        System.out.println(m1.divisor_sum(n));
    }
}
