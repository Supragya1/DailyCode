// Day120_Q2.java
// There are 5 types of inheritance in java
// 1. Single inheritance - when a child class inherits only one parent class       //^ class1-(parent)-----> class2(child)
// 2. Multilevel inheritance - when a child class inherits a parent class and then the child class becomes the parent class for another class   //^ class1-(parent)-----> class2(child of class1)(parent of class3)-----> class3(child)
// 3. Hierarchical inheritance - when a parent class is inherited by multiple child classes     //^ class1-(parent)-----> class2(child) and class3(child)
// 4. Multiple inheritance - when a child class inherits multiple parent classes. 
// This is not supported in java through classes because of ambiguity problem. It is supported through interfaces in java  //^ class1(parent) and class2(parent)-----> class3(child)
// 5. Hybrid inheritance - when 2 child class inherits a parent class and then another child class inherits the 2 child classes 
// then it is called hybrid inheritance This is not supported in java through classes because of ambiguity problem. 
// It is supported through interfaces in java //^ class1-(parent)-----> class2(child of class1)(parent of class4) and class3(child of class1)(parent of class4) -----> class4(child of class2)(child of class3)

// Single Inheritance
// here the Dog class inherits the Animal class
class Animal{
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("barking");
    }
}

// Multilevel Inheritance
// here the Dog class inherits the Mamal class and the Mamal class inherits the Animal class
class Animal1{
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
}
class Mamal extends Animal1{
    public void walk(){
        System.out.println("walking");
    }
}
class Dog1 extends Mamal{
    public void bark(){
        System.out.println("barking");
    }
}

// Hierarchical Inheritance
// here the Dog class and the Cat class inherits the Animal class
class Animal2{
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
}
class Dog2 extends Animal2{
    public void bark(){
        System.out.println("barking");
    }
}
class Cat extends Animal2{
    public void meow(){
        System.out.println("meowing");
    }
}
// main class
public class Types_of_Inheritance_140 {
    public static void main(String[] args) {
    // Single Inheritance
    // Creating an object of the Animal parent class
    Animal a = new Animal();
    // Animal class can access the eat and sleep method of the Animal class
    System.out.println("Calling the eat and sleep method of the Animal class ##Single Inheritance##");
    a.eat();
    a.sleep();
    // Creating an object of the Dog child class
    Dog d = new Dog();
    // Dog class can access the eat and sleep method of the Animal class
    System.out.println("Calling the eat and sleep method of the Dog class inherited by animal class and bark method of its own ##Single Inheritance##");
    d.eat();
    d.sleep();
    d.bark();
    
    // Multilevel Inheritance
    // Creating an object of the Animal1 parent class
    Animal1 a1 = new Animal1();
    // Animal1 class can access the eat and sleep method of the Animal1 class
    System.out.println("Calling the eat and sleep method of the Animal1 class ##Multilevel Inheritance##");
    a1.eat();
    a1.sleep();
    // Creating an object of the Mamal child class
    Mamal m = new Mamal();
    // Mamal class can access the eat, sleep and walk method of the Animal1 class
    System.out.println("Calling the eat, sleep and walk method of the Mamal class inherited by animal1 class and walk method of its own ##Multilevel Inheritance##");
    m.eat();
    m.sleep();
    m.walk();
    
    // Hierarchical Inheritance
    // Creating an object of the Animal2 parent class   
    Animal2 a2 = new Animal2();
    // Animal2 class can access the eat and sleep method of the Animal2 class
    System.out.println("Calling the eat and sleep method of the Animal2 class ##Hierarchical Inheritance##");   
    a2.eat();
    a2.sleep();
    // Creating an object of the Dog2 child class
    Dog2 d2 = new Dog2();
    // Dog2 class can access the eat, sleep and walk method of the Animal2 class
    System.out.println("Calling the eat, sleep and walk method of the Dog2 class inherited by animal2 class and bark method of its own ##Hierarchical Inheritance##");
    d2.eat();
    d2.sleep();
    d2.bark();
    // Creating an object of the Cat child class
    Cat c = new Cat();
    // Cat class can access the eat and sleep  method of the Animal2 class
    System.out.println("Calling the eat and sleep method of the Cat class inherited by animal2 class and meow method of its own ##Hierarchical Inheritance##");
    c.eat();
    c.sleep();
    c.meow();

    }
}
