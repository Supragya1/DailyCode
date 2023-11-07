// Day91_Q1.java
// Java Exception Handling HackerRank 
import java.util.*;
class MyCalculator{
    public long power(int n,int p)throws Exception{
        if(n<0||p<0){
            throw new Exception("n or p should not be negative.");
        }
        if(n==0&&p==0){
            throw new Exception("n and p should not be zero.");
        }
        else{
            return (long)Math.pow(n,p);
        }
    }    
}

public class java_exception_handling2{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyCalculator c1 = new MyCalculator();
        while(scan.hasNext()){
            int n = scan.nextInt();
            int p = scan.nextInt();
            try{
                System.out.println(c1.power(n,p));
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
