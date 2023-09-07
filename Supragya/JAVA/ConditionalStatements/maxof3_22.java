// Day44_Q2.java
// maxof3_22.java
import java.util.*;
public class maxof3_22 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 Numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
              if(a!=b && b!=c && c!=a)
              {
                if(a>b)
                 {
                  if(a>c)
                  System.out.println("a = "+a+" is the biggest number");
                  else 
                  System.out.println("c = "+c+" is the biggest number");
                 }
                 else
                 if(b>c)
                 System.out.println("b = "+b+ " is the biggest number");
                 else
                 System.out.println("c = "+c+" is the biggest number");
              }
              else 
              if(a!=b || b!=c || c!=a)
             {
              if(a==b && (b>c || b<c))
              {
                if(b>c)
                System.out.println("a = "+a+" and b = "+b+" are equal and greater than c = "+c);
                else
                System.out.println("a = "+a+" and b = "+b+" are equal but c = "+c+" is greater then both");
              }
              if (b==c && (c>a || c<a))
              {
                if(c>a)
                System.out.println("c = "+c+" and b = "+b+" are equal and greater than a = "+a);
                else
                System.out.println("c = "+c+" and b = "+b+" are equal but a = "+a+" is greater then both");
              }
              if (a==c && (c>b || c<b))
              {
                if(b<c)
                System.out.println("a = "+a+" and c = "+c+" are equal and greater than b = "+b);
                else
                System.out.println("a = "+a+" and c = "+c+" are equal but b = "+b+" is greater then both");
              }
            }
              else 
              System.out.println("All numbers are same");
    }
}
