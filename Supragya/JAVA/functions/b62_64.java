import java.util.*;
public class b62_63{
    public static int binary_decimal(int binary){
        int ld,decimal=0,i=0;
        while(binary!=0){
            ld=binary%10;
            binary/=10;
            decimal+=ld*Math.pow(2,i);
            i++;
        }
        return decimal;
    }
     public static int decimal_binary(int decimal){
        int ld,binary=0,i=0;
        while(decimal!=0){
            ld=decimal%2;
            decimal/=2;
            binary+=ld*Math.pow(10,i);
            i++;
        }
        return binary;
     }
    public static void main(String[]arg){
        Scanner scan = new Scanner(System.in);
      int binary =scan.nextInt();
      int decimal1=binary_decimal(binary);
      int binary1=decimal_binary(decimal1);
        System.out.println("Decimal after conversion of binary "+binary+" is "+decimal1);
        System.out.println("Binary after conversion of decimal "+decimal1+" is "+binary1);
    }
}