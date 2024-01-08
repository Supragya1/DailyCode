// Day120_Q1.java
// Inheritance is one of the pillar of OOPs concept. Inheritance is a mechanism in which a child class acquires all 
// the properties, methods and behaviors of a parent class. It is an important part of OOPs. 
// inheritance is used to achieve runtime polymorphism ie method overriding and method overloading 
// Inheritance is used to achieve reusability of code
// Inheritance is like passing user properties to the child class. point to remenber is that the child class can also have its own properties 
class Animal{
    // Animal class can have its own properties
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
}
class Dog extends Animal{
    // Dog also inherited the eat and sleep method from the Animal class
    // Dog class can also have its own properties
    public void bark(){
        System.out.println("barking");
    }
}
public class Inheritance_132{
    public static void main(String[] args) {
        // Creating an object of the Animal parent class
        Animal a = new Animal();
        // Animal class can access the eat and sleep method of the Animal class
        System.out.println("Calling the eat and sleep method of the Animal class");
        a.eat();
        a.sleep();
        // Creating an object of the Dog child class
        Dog d = new Dog();
        // Dog class can access the eat and sleep method of the Animal class
        System.out.println("Calling the eat and sleep method of the Dog class");
        d.eat();
        d.sleep();
        d.bark();
    }
}