// Day122_Q1.java
//! Polymorphism - Poly means many and morphism means forms. Polymorphism means many forms.
//~ Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in OOP 
//~ occurs when a parent class reference is used to refer to a child class object.
//% There are two types of polymorphism in java: compile time polymorphism and runtime polymorphism.
//% Method Overloading (Compile time polymorphism)
//* Method Overloading: When there are multiple functions with same name but different parameters then these functions are said to be overloaded.
//* Functions can be overloaded by change in number of arguments or/and change in type of arguments.
//* We cannot overload functions by change in return type of function only.
//* We can overload main() function in java but with different arguments only.
//* In java, Method Overloading is not possible by changing the return type of the method only because of ambiguity.
//* In java, method overloading is not possible by changing the access modifier of the method only because of ambiguity.
//% Method Overriding (Runtime polymorphism)
//$ If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
//$ In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.
//$ Usage of Java Method Overriding
//$ Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
//$ Method overriding is used for runtime polymorphism
//$ Rules for Java Method Overriding
//$ The method must have the same name as in the parent class
//$ The method must have the same parameter as in the parent class.
//$ There must be an IS-A relationship (inheritance).
//% Difference between method overloading and method overriding in java
//& Method overloading increases the readability of the program.
//& Method overriding provides the specific implementation of the method that is already provided by its super class parameter must be different in case of method overloading, parameter must be same in case of method overriding.
//& Method overloading is the example of compile time polymorphism.
//& Method overriding is the example of run time polymorphism.
//& In java, method overloading can't be performed by changing return type of the method only. Return type can be same or different in method overloading. But you must have to change the parameter.
//& Method overriding is performed by changing the method body.
//& In java, static methods can be overloaded but they cannot be overridden. Only inherited methods can be overridden.
//& We cannot override the static methods because method overriding is based on dynamic binding at runtime and the static methods are bonded using static binding at compile time.
//& In java, we can override the private methods also but we cannot access them outside the class.
//& Object class is the superclass of all the classes in java.
//& If a class doesn't extend any other class then it is direct child class of Object and if extends other class then it is an indirectly derived.
//& The toString() method of Object class returns the string representation of the object.
//& If you print any object, java compiler internally invokes the toString() method on the object. So overriding the toString() method, returns the desired output, it can be the state of an object etc. depends on your implementation.
//& The java compiler automatically changes the code that looks like this: System.out.println(obj) into System.out.println(obj.toString());
class sum{
    //^ Method Overloading
    int operation(int a, int b){
        System.out.print("a+b = ");
        return a+b;
    }
    int operation(int a, int b, int c){
        System.out.print("a+b+c = ");
        return a+b+c;
    }
    double operation(double a, double b){
        System.out.print("a+b = ");
        return a+b;
    }
}
class sub extends sum{
    //^ Method Overriding
    @Override
    int operation(int a, int b){
        System.out.print("a-b = ");
        return a-b;
    }
    @Override
    int operation(int a, int b, int c){
        System.out.print("a-b-c = ");
        return a-b-c;
    }
    @Override
    double operation(double a, double b){
        System.out.print("a-b = ");
        return a-b;
    }
}
public class Polymorphism_144 {
    public static void main(String[] args) {
        //^ Method Overloading
        sum s = new sum();
        System.out.println(s.operation(10, 20));
        System.out.println(s.operation(10, 20, 30));
        System.out.println(s.operation(10.5, 20.5));
        //^ Method Overriding
        sub s1 = new sub();
        System.out.println(s1.operation(10, 20));
        System.out.println(s1.operation(10, 20, 30));
        System.out.println(s1.operation(10.5, 20.5));
    }   
}
