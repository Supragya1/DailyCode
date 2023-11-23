// Day84_Q2.java
// Java Inheritance 2 Hackerrank
import java.io.*;
import java.util.*;
class Arithmetic{
    Arithmetic(){}
}
class Adder extends Arithmetic{
    Adder(){}
    int sum(int a,int b){
        return a+b;
    }
}
public class java_inheritance2 {

    public static void main(String[] args) {
        Adder a = new Adder();
    System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
    System.out.println(a.sum(10,32) + " " + a.sum(10,3) + " " + a.sum(10,10));
     }
}