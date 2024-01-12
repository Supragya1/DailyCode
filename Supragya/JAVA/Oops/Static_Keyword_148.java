// Day124_Q1.java
//! Static Keyword
//% Static keyword is used for a constant variable or a method that is common to all the instances of a class.
//& Static keyword can be used with class, variable, method and block. Static members belong to the class instead of a 
//% specific instance, this means if you make a member static, you can access it without object.
//% Static members are initialized before the initialization of any instance members of the class. Java static methods can 
//% be called without creating an object of the class.
//% Static members are members of the class instead of the instance/object.
//% Static variables are shared variables, it means all instances of the class will share the same static variable.
//$ Static methods - Static methods can be called without creating an object of the class. Static methods can access static
//$ variables and static methods directly. Static methods cannot access instance variables or instance methods directly,
//$ they need some object reference to do so.
//$ Static methods are usually used to create utility functions. For example, main() method is static. We don’t need to
//$ create an object to call the main() method.
//$ Static methods can be overloaded but cannot be overridden, even if you declare a same static method in child class it
//$ has nothing to do with the same method of parent class.
//$ Static methods cannot can be accessed by calling with the class name ClassName.MethodName.
//^ Static block - Static block is used for initializing the static variables. This block gets executed when the class is
//^ loaded in the memory. A class can have multiple Static blocks, which will execute in the same sequence in which they
//^ have been written into the program.
//^ Static block vs Constructor - Static block gets executed when the class is loaded in the memory whereas the constructor
//^ gets executed when an object of the class is created. ie Static block is executed before the constructor.
//& Static variables - Static variables are also known as Class variables. These variables are declared similarly as instance
//& variables, the difference is that static variables are declared using the static keyword within a class outside any method
//& constructor or block.
//& Static variables are initialized only once, at the start of the execution. These variables will be initialized first,   
//& before the initialization of any instance variables.
//& A single copy to be shared by all instances of the class.
//& A static variable can be accessed directly by the class name and doesn’t need any object.
//& The static variable can be used to refer to the common property of all objects (which is not unique for each object),
//& for example, the company name of employees, college name of students, etc.
//~ The static variable gets memory only once in the class area at the time of class loading.instead of each time when the 
//~ instance is created.
//~ Static variables can be accessed by calling with the class name ClassName.VariableName.
//~ Static variables can be accessed by calling with the object name ObjectName.VariableName.
//@ Static class - we will discuss it in upcoming lectures.
class Student {
    int rollNo;
    String name;
    static String college = "UPES";
    //! static method to change the value of static variable
    static void change() {
        college = "University of Petroleum and Energy Studies";
    }
    //! constructor to initialize the variable
    Student(int rollNo, String name) {
        System.out.println("Constructor invoked");
        this.rollNo = rollNo;
        this.name = name;
    }
    //! method to display values
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
    //! Static block
    static {
        System.out.println("Static block will be executed first even before the constructor");
    }
    //! Static method
    static void staticMethod() {
        System.out.println("Static method called without creating an object of the class");
    }
}
public class Static_Keyword_148 {
    public static void main(String[] args) {   
        //! Static block will be executed first even before the constructor
        //! Static method called without creating an object of the class
        Student.staticMethod();  
        Student s1 = new Student(500107073, "Supragya");
        Student s2 = new Student(500107074, "Rahul");
        Student s3 = new Student(500107075, "Rohit");
        s1.display();
        s2.display();
        Student.change();
        s3.display();
    }
}