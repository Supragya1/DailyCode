// Day124_Q2.java
//! This Keyword
//$ this keyword is used to refer to the current object
//$ this keyword can be used to refer to the current class instance variable
//$ this() can be used to invoke current class constructor
//$ this keyword can be passed as an argument in the method call
//$ this keyword can be passed as argument in the constructor call
//$ this keyword can be used to return the current class instance from the method
//$ this keyword can be used to return the current class instance from the constructor
//$ this keyword can be used to chain constructors in java
//$ this keyword can be used to invoke current class method
class Sum {
    int a;
    int b;
    Sum() {
        this(5, 6);
        System.out.println("I am a default constructor");
    }
    Sum(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("I am a parameterized constructor");
    }
    Sum(int a) {
        this.a = a;
        System.out.println("I am a parameterized constructor with one argument");
    }
    Sum(int a, int b, int c) {
        this(a, b);
        System.out.println("I am a parameterized constructor with two arguments");
    }
    void display() {
        System.out.println("a = " + a + " b = " + b);
    }
    Sum get() {
        return this;
    }
    void print() {
        System.out.println("Hello");
    }
    void show() {
        this.print();
        System.out.println("World");
    }
}
public class This_Keyword_149 {
    public static void main(String[] args) {
        Sum s1 = new Sum();
        Sum s2 = new Sum(5);
        Sum s3 = new Sum(5, 6);
        Sum s4 = new Sum(5, 6, 7);
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        Sum s5 = s1.get();
        s5.display();
        s1.show();
    }
}
