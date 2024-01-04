// Day116_Q2.java
// classes are user defined data types
// classes are like the blue print of the object for eg i have  a class vehicle then car,motorcycle,bus are objects of the class vehicle
// class is a template or blue print used to create objects class contains properties and attributes that object will have
// object is an instance of a class for eg car is an object of class vehicle
import java.util.*;
public class Classes_objects_125 {
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Pen p1 = new Pen(); // created a pen object called p1
    p1.Setcolor("Blue");
    System.out.println(p1.color);
    p1.SetTip(5);
    System.out.println(p1.tip);
    p1.color="yellow"; // call function or directly define
    System.out.println(p1.color);
 
   
 }    
}

// class is a blue print or template
class Pen{
    String color;
    int tip;
    void Setcolor(String newcolor){
        color = newcolor;
    }
    void SetTip(int newtip){
        tip = newtip;
    }
}
class Student{
    String name;
    int age;
    float percentage;
    void calPercentage(int phy,int chem,int maths){
        percentage = (phy+chem+maths)/3;
    }
}
