// Day84_Q1.java
// Java Inheritance 1 Hackerrank 
import java.util.*;
class Animal{
    void walk(){
        System.out.println("I am walking");
    }
    void fly(){
        
    }
}
class Bird extends Animal{
    void fly(){
       System.out.println("I am flying"); 
    }
    void sing(){
        System.out.println("I am singing");
    }
}
public class java_inheritance1 {

    public static void main(String[] args) {
        Bird b = new Bird();
        b.walk();
        b.fly();
        b.sing();
    }
}
