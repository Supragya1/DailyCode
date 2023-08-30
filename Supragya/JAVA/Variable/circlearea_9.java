// Day32_Q1.java
//circlearea_9
import java.util.*;
public class circlearea_9{
public static void main(String[]args){

    Scanner scan =new Scanner(System.in);
    float pi = 3.14f;
    System.out.println("enter the value of radius");
    float r= scan.nextFloat();
    
    float area = pi*r*r;
    System.out.println(area);

    //or
    System.out.println(pi*r*r);
}
}
