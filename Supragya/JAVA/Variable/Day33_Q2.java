// typepromotion_12
import java.util.*;
public class typepromotion_12 {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        char a ='a';
        char b ='b';
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(b-a);

        // or
         byte c = 15;
         short d= 10;
         int e=a+c+d;
         System.out.println(e);

         // or
         int i =23;
          float f = 25.36f;
          long g = 246;
          double h =23.63;
          double ans = i+f+g+h;
          System.out.println(ans);
    }
}
