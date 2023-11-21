// Day94_Q1.java
// Java Overriding 2 (Super Keyword) Hackerrank 
import java.util.*;
class Bicycle{
    public String property(){
        return "a vehicle with pedals.";
    }
}
class Motorcycle extends Bicycle{
    @Override
    public String property(){
        return "a cycle with an engine.";
    }
    Motorcycle(){
        System.out.println("Hello I am a motorcycle, I am "+property());
        System.out.println("My ancestor is a cycle who is "+super.property());
    }
}
public class java_overriding2 {
    public static void main(String[] args) {
        Motorcycle m = new Motorcycle();
    }
}
