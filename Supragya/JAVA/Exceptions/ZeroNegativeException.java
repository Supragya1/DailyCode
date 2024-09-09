// Implement a calculator to compute the power of a number. Create a class 'Calc' with a
// single method 'long power(int a, int b).' This method takes two integers 'a' and 'b' as
// parameters and finds 'a^b.' If either 'a' or 'b' is negative, the method should throw an
// exception with the message "a and b should not be negative." If both 'a' and 'b' are zero,
// the method should throw an exception with the message "a and b should not be zero.

import java.util.Scanner;

class NonNegativeException extends Exception{
    public NonNegativeException(String msg){
        super(msg);
    }
}
class Calc{
    public long power(int a, int b) throws NonNegativeException{
        if(a<0 || b<0){
            throw new NonNegativeException("neither a and b should not be negative");
        }
        else if(a==0 && b==0){
            throw new NonNegativeException("a and b should not be zero");
        }
        return (long)Math.pow(a, b);
    }
}
public class ZeroNegativeException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = scan.nextInt();
        System.out.println("Enter the value of b");
        int b = scan.nextInt();
        Calc c = new Calc();
        try{
            System.out.println("The value of a^b is "+c.power(a,b));
        }
        catch(NonNegativeException e){
            System.out.println(e.getMessage());
        }
    }
}
