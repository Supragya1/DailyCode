import java.util.Scanner;
public class nth_fibonacci_number_156 {
    public static int fibonacci(int n) {
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scan.nextInt();
        //^ Recursion method
        long start = System.currentTimeMillis();
        System.out.println(n+"th fibonacci number is "+fibonacci(n));
        long end = System.currentTimeMillis();
        System.out.println("Time taken by recursion is : "+(end-start)+"ms");
        //^ Iteration method 
        start = System.currentTimeMillis();
        int a=0,b=1,c=0;
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(n+"th fibonacci number is "+c);
        end = System.currentTimeMillis();
        System.out.println("Time taken by iteration is : "+(end-start)+"ms");
    }
}
