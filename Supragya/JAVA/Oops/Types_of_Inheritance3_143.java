// Day121_Q2.java
//! now talking about Hybrid inheritance
//@ hybrid inheritance is a combination of hierarchical and multiple inheritance
//& in java hybrid inheritance is not supported through classes because of ambiguity problem
//% this problem is solved by interfaces in java

//! Important points 
//* 1. A class can implement any number of interfaces but can extend only one class.
//* 2. Interface can extend another interface, similarly abstract class can extend another abstract class but a class can extend only one class or abstract class.
//* 3. Interfaces have all the fields public, static and final by default.
//* 4. A class can extend only one class but can implement any number of interfaces.
//* 5. The first concrete class that implements the interface must provide the implementation of all the methods of that interface.
//* 6. An interface can extend another Java interface only, an abstract class can extend another Java class or abstract class.
//* 7. An interface can extend another interface multiple times.
//* 8. An interface cannot implement another interface, an abstract class can implement another Java interface.
//* 9. An interface cannot extend an abstract class, an abstract class can extend another Java class or abstract class.
//* 10. An interface cannot implement a class, an abstract class can implement a Java interface.

interface Animal{ //^ this is a parent class
    abstract public void eat(); //$ this is a abstract method
    abstract public void sleep();//$ this is a abstract method
}
interface Mamal extends Animal{ //^ this is a parent class
    abstract public void walk();//% this is a abstract method
    abstract public void livesOnLand();//% this is a abstract method
}
interface fish extends Animal{ //^ this is a parent class
    abstract public void swim();//% this is a abstract method
    abstract public void livesInWater();//% this is a abstract method
}

class amphibian implements Mamal,fish{ //^ this is a child class
    //@ this class is inheriting 2 parent classes
    //% abstract method need to be overriden in the child class
    @Override
    public void eat(){ //& this is a inherited method
        System.out.println("amphibian is eating");
    }
    @Override
    public void sleep(){ //& this is a inherited method
        System.out.println("amphibian is sleeping");
    }
    @Override
    public void walk(){ //& this is a inherited method
        System.out.println("amphibian is walking");
    }
    @Override
    public void livesOnLand(){ //& this is a inherited method
        System.out.println("amphibian lives on land");
    }
    @Override
    public void swim(){ //& this is ainherited method
        System.out.println("amphibian is swimming");
    }
    @Override
    public void livesInWater(){ //& this is a inherited method
        System.out.println("amphibian lives in water");
    }
    //^ this is a normal method
    public void livesInBothLandAndWater(){
        System.out.println("amphibian lives in both land and water");
    }
}


public class Types_of_Inheritance3_143 {
    public static void main(String[] args) {
        amphibian a = new amphibian();
        a.eat();
        a.sleep();
        a.walk();
        a.livesOnLand();
        a.swim();
        a.livesInWater();
        a.livesInBothLandAndWater();
    }
}
