// Day123_Q1.java
//! Abstraction is a process of hiding the implementation details or unnecessary data from the user and only showing the essential features of the object. 
//$ In other words, it deals with the outside view of an object (interface).The only good example of abstraction could be TV remote. 
//$ We don't know the internal processing of the TV or we don't need to know the process of the TV. We only press the buttons and it works.
//$ Abstraction lets you focus on what the object does instead of how it does it.
//$ Ways to achieve Abstraction:
//% Abstract class (0 to 100%)
//% Interface (100%)
//@ Abstract class:
//% A class which is declared with the abstract keyword is known as an abstract class in Java.
//% It can have abstract and non-abstract methods (method with the body). it can have constructors and static methods also.
//* Abstract method: A method which is declared as abstract and does not have implementation is known as an abstract method.
//% Abstract class is used to achieve abstraction. Abstraction is a process of hiding the implementation details and showing only functionality to the user.
//% Abstract class and interface both can have abstract methods which are not implemented.
//% Normal classes (non-abstract classes) can't have abstract methods.
// @ Rules for Abstract class:
//% Abstract class cannot be instantiated.
//% Abstract class may or may not contain abstract methods.
//% If you are extending an abstract class that has an abstract method, you must either provide the implementation of the method or make this class abstract.
//% Abstract class can contain constructors and static methods also.
//% It can have final methods which will force the subclass not to change the body of the method.
//% Abstract class can have final variables.
abstract class Parent{
    String name;
    Parent(){
        System.out.println("This is the constructor of the abstract class");
    }
    abstract void fun1();
    void fun2(){
        System.out.println("This is the normal method of the abstract class");
    }
    static void fun3(){
        System.out.println("This is the static method of the abstract class");
        System.out.println("It can be called without creating the object of the class");
        System.out.println("It cant be overridden");
        System.out.println("It can't be inherited");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("This is the constructor of the child class");
    }
    @Override
    void fun1(){
        System.out.println("This is the abstract method of the abstract class in the child class");
    }
    @Override
    void fun2(){
        System.out.println("This is the normal method of the abstract class in the child class");
    }
    //~ This will give an error as we can't override the static method
    // void fun3(){
    //     System.out.println("This is the static method of the abstract class in the child class");
    // }
    void fun4(){
        System.out.println("This is the normal method of the child class");
    }
}
public class Abstraction_146 {
    public static void main(String[] args) {
        // Parent p = new Parent(); //? This will give an error as we can't create the object of the abstract class
        Child c = new Child();
        System.out.println("");
        c.fun1();
        System.out.println("");
        c.fun2();
        System.out.println("");
        c.fun3();//~ This will call the static method of the abstract class it is not overriding the method
        System.out.println("");
        Parent.fun3();//~ This will also call the static method of the abstract class
        System.out.println("");
        c.fun4();
    }
}
