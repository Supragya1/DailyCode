// Day118_Q2.java
// Constructor is a special method which is invoked automatically at the time of object creation
// Constructor have the same name as class or structure
// Constructor dont have any return type (Not even void)
// Constructors are only called once, at time of object creation
// Memory allocation happens when constructor is called
// if we dont make constructor ourself like in previous pen class java defines the constructor itself
// if we make constructor ourself then java doesnt define the constructor itself
// if we make constructor ourself then we have to define the default constructor also
// there are parameterized , non parameterized constructors and copy constructors
import java.util.Scanner;

public class Constructor_129 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student s1 = new Student("Supragya");
        System.out.println(s1.name);

    }
}// the constructor defined by java itself doesnt have any parameters
// but we can add parameters in constructors we initialize ourself
class Student{
    String name;
    int roll;
    Student(String name){// constructor
        this.name=name;
        System.out.println("Constructor is called");
    }
}