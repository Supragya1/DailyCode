// Day118_Q1.java
// pillars of OOPS
// 1) Encapsulation   2) Polymorphism 3)Inheritance   4) Abstraction
// Encapsulation - It is defined as the wrapping up of data and methods under a single single unit.It also implements Data hiding 
import java.util.Scanner;
public class Encapsulation_128 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee e1 = new Employee();
        System.out.println("Enter your name");
        String name = scan.next();
        e1.setname(name);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        e1.setage(age);
        System.out.println("Enter your Salary");
        double salary = scan.nextDouble();
        e1.setsalary(salary);
        System.out.println("Your name is "+e1.getname());
        System.out.println("Your age is "+e1.getage());
        System.out.println("Your salary is "+e1.getsalary());

    }
}
class Employee{
    private String name;
    private int age;
    private double salary;

    // setter methods
    public void setname(String name){
        this.name = name;
    }
    public void setage(int age){
        this.age =age;
    }
    public void setsalary(double salary){
        this.salary =salary;
    }
    // getter method
    public String getname(){
        return this.name;
    }
    public int getage(){
        return this.age;
    }
    public double getsalary(){
        return this.salary;
    }
}