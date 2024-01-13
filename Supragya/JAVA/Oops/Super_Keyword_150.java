// Day125_Q1.java
//! Super Keyword
//$ super keyword is used to refer to the immediate parent class object
//$ super keyword can be used to invoke parent class method
//$ super keyword can be used to invoke parent class constructor
//$ super keyword can be used to refer to the parent class instance variable
//$ super keyword can be used to invoke parent class method with the same name
class Animal {
    String color = "White";
    Animal() {
        System.out.println("Animal constructor is invoked");
    }
    void eat() {
        System.out.println("Eating...");
    }
}
class Dog extends Animal {
    Dog() { //~ super() is added by compiler implicitly
        super();
        System.out.println("Dog constructor is invoked");
    }
    String color = "Black";
    void eat() {
        System.out.println("Eating bread...");
    }
    void bark() {
        System.out.println("Barking...");
    }
    void work() {
        super.eat();
        bark();
    }
    void display() {
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class Super_Keyword_150 {
    public static void main(String[] args) {
        
    }
}
