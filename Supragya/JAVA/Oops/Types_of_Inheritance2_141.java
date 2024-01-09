// Day121_Q1.java
//! now talking about multiple inheritance
// in java multiple inheritance is not supported through classes because of ambiguity problem 
// ie if a child class inherits 2 parent classes and both the parent classes have a method with 
// the same name then the child class will not know which method to inherit
// this problem is solved by interfaces in java
//* Interface - interface is a blueprint of a class. It has static constants and abstract methods only. 
// The interface in java is a mechanism to achieve abstraction. There can be only abstract methods in the java 
// interface not method body. It is used to achieve abstraction and multiple inheritance in Java.
//& Interface -  It only conatins abstract methods and after java 8 it can also contain default and static methods 
interface Animal{ //^ this is a parent class
    abstract public void eat(); //$ this is a abstract method
    abstract public void sleep();//$ this is a abstract method
}
interface Mamal{ //^ this is a parent class
    abstract public void walk();//% this is a abstract method
    abstract public void run();//% this is a abstract method
}
class Human implements Animal,Mamal{ //^ this is a child class
    //@ this class is inheriting 2 parent classes
    //% abstract method need to be overriden in the child class
    @Override
    public void eat(){ //& this is a inherited method
        System.out.println("Human is eating");
    }
    @Override
    public void sleep(){ //& this is a inherited method
        System.out.println("Human is sleeping");
    }
    @Override
    public void walk(){ //& this is a inherited method
        System.out.println("Human is walking");
    }
    @Override
    public void run(){ //& this is a inherited method
        System.out.println("Human is running");
    }
    //^ this is a normal method
    public void speak(){
        System.out.println("Human is speaking");
    }
}
public class Types_of_Inheritance2_141 {
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        h.sleep();
        h.walk();
        h.run();
        h.speak();
    }
}
