// input_5
import java.util.*; // important to write to scan 
public class input_5{
    public static void main(String[]args){
    Scanner scan = new Scanner (System.in); // to scan imp to write 
   
    System.out.println("enter an input as a line or word  or number");
    String a = scan.nextLine();//scanner.nextLine for line or word or number
    System.out.println(a);

    System.out.println("enter an input as a word or letter or number");
    String b = scan.next();  // scanner.next for single word or letter
    System.out.println(b);
 
    System.out.println("enter an input as a word or letter or number");
    String c = scan.next(); 
    System.out.println(c);

    System.out.println("enter an input as a letter or special character");
    char ch = scan.next().charAt(0);
    System.out.println(ch);
  
    System.out.println("enter an input as a integer");
    int d = scan.nextInt();
    System.out.println(d);
  
    System.out.println("enter an input as a float value ");
    float e = scan.nextFloat();
    System.out.println(e);

    System.out.println("enter an input as a long integer value ");
    long f = scan.nextLong();
    System.out.println(f);

    System.out.println("enter an input as a long float value ");
    double g = scan.nextDouble();
    System.out.println(g);

    System.out.println("enter an input as true or false ");
    boolean h = scan.nextBoolean();
    System.out.println(h);

    }
}
