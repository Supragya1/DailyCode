// Day123_Q2.java
//@ Interface
//% An interface in Java is a blueprint of a class. It has static constants and abstract methods only.
//% The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.
//% In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.
//% Java Interface also represents the IS-A relationship.
//$ It cannot be instantiated just like the abstract class.
//$ Since Java 8, we can have default and static methods in an interface.
//$ Since Java 8, we can have private and static methods in an interface also.
//$ default methods in interfaces can be overridden in the implementation class.
//@ Rules for Interface:
//$ Interface can't have the constructor.
//% Interface cannot be instantiated.
//% Interface can have abstract methods and variables.
//% Interface cannot have a method body.
//% Interface can have static methods which are public and default methods which are public.
//% Interface can have private methods also.
//$ Interface can have variables which are public, final and static.
//% Interface can extend other interfaces only and cannot implement it.
//% Interface cannot extend a class.
//% Interface can extend multiple interfaces.
//% A class can implement multiple interfaces.
//% A class which is implementing the interface must provide the implementation of all the methods.
//% A class can implement multiple interfaces.
//@ Why use Java interface?
//% It is used to achieve abstraction.
//% By interface, we can support the functionality of multiple inheritance.
//% It can be used to achieve loose coupling. So, it is good for the testability of the application and maintenance of the application.
//* loose coupling: Loose coupling is a design goal that seeks to reduce the inter-dependencies between components of a 
//* system with the goal of reducing the risk that changes in one component will require changes in any other component.
//% It can be used to achieve abstraction and polymorphism.
//% It is used to achieve security.
//@ Abstract class vs Interface
//$ Abstract class and interface both can have abstract methods which are not implemented.
//$ Interface is used to achieve abstraction and multiple inheritance in Java.
//$ Abstract class can have abstract and non-abstract methods.
//$ Interface can have abstract methods, static methods and default methods.
//$ Abstract class can have final, non-final, static and non-static variables.
//$ Interface can have only static and final variables.
//$ Abstract class can have static methods, constructors and a main() method also.
//$ Interface can have static methods and can't have constructors and a main() method.
//$ Abstract class can extend another Java class and implement multiple Java interfaces.
//$ Interface can extend another Java interface only.
//@ Marker Interface
//% An interface that has no member is known as a marker or tagged interface, for example, Serializable, Cloneable, Remote, etc. 
//% They are used to provide some essential information to the JVM so that JVM may perform some useful operation.
//% The marker interface is an empty interface in Java since it has no member. It is used to mark Java classes so that JVM can do some special operation on those classes.
//$ The marker interface is also known as a tag interface.
//% The most common examples of marker interface in Java are Serializable, Cloneable etc. The marker interface was first introduced in Java 1.1 and Serializable is the first marker interface in Java.
//% There are three uses of marker interface in Java:
//% 1. It is used to mark the Java classes so that JVM can take some special action on the marked class.
//% 2. It is used to provide the direction to the compiler to implement the additional methods.
//% 3. It is used to provide the information to the developer.
//% The marker interface provides the run-time information to the JVM. The JVM then performs some operation based on the marker interface.
//% For example, if the JVM sees the Serializable interface then it will serialize the object and if JVM sees Cloneable interface then it will create the clone of the object.
//% The marker interface is generally used to create the generic APIs.
//% The marker interface is used to provide the run-time information to the JVM so that JVM may perform some useful operation.
//% The marker interface is used to provide the direction to the compiler to add some special code in the class implementing the marker interface.
interface Parent{
    void fun1();
    void fun2();
    default void fun3(){
        System.out.println("This is the default method of the interface");
    }
    static void fun4(){
        System.out.println("This is the static method of the interface");
        System.out.println("It can be called without creating the object of the class");
        System.out.println("It cant be overridden");
        System.out.println("It can't be inherited");
    }
}
class Child implements Parent{
    @Override
    public void fun1(){
        System.out.println("This is the fun1 method of the interface in the child class");
    }
    @Override
    public void fun2(){
        System.out.println("This is the fun2 method of the interface in the child class");
    }
    @Override
    public void fun3(){
        System.out.println("This is the overridden default method of the interface in the child class");
    }
    // @Override
    // public void fun4(){
    //     System.out.println("This is the overridden static method of the interface in the child class");
    // }
    public void fun5(){
        System.out.println("This is the normal method of the child class");
    }
}
public class Abstraction2_147 { 
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("");
        c.fun1();
        System.out.println("");
        c.fun2();
        System.out.println("");
        c.fun3();
        System.out.println("");
            //! c.fun4(); This will give an error as we can't override the static method
        Parent.fun4(); //% This is the correct way to call the static method of the interface
        System.out.println("");
        c.fun5();
    }
}

