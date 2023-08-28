// typecasting_11 
import java.util.*; // ALSO KNOWN AS NARROWING CONVERSION OR EXPLICIT CONVERSION
public class typecasting_11 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        float a = 23.514f;
        int b = (int)a;
        System.out.println(b);
        // or
        float c = scan.nextFloat();
        int d = (int)c;
        System.out.println(d);

    // or
    float e = 352.32f;
    System.out.println((int)e);

    //or
    float f = scan.nextFloat();
        System.out.println((int)f);
    }
}
