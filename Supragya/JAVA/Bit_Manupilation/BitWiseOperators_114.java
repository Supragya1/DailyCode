// Day15_Q1.java
//BitWiseOperators_114
import java.util.Scanner;

public class BitWiseOperators_114 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = scan.nextInt();
        System.out.println("Enter the value of b");
        int b = scan.nextInt();
        //   a   b     And(&)   Or(|)     Xor(^)    1'sComplement(~)(NOT)  Left shift(<<)(a*2^b)  5Right Shift(a>>b)(a/2^b)
        //   0   0       0        0         0         ~0 =1               a<<b means remove b      a>>b means remove b
        //   0   1       0        1         1         ~1=0                bits from left side      bits from right side
        //   1   0       0        1         1       for program remeber   and move every other     and move every other
        //   1   1       1        1         0           ~a =-(a+1)        bit to left and add 0    bit to right and add 0
    //if  5(101) 6(110)  4(100)   7(111)   3(011)                          in khali places in rt  in khali places in left
        System.out.println("a & b = " + (a&b));
        System.out.println("a | b = " + (a|b));
        System.out.println("a ^ b = " + (a^b));
        System.out.println("~a = " + (~a));
        System.out.println("a<<b = " + (a<<b));
        System.out.println("a>>b = " + (a>>b));
    }
}
