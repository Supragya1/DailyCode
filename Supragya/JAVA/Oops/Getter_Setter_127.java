// Day117_Q2.java
// this: this keyword is used to refer to the current object
// this keyword is a reference to the current instance of a class. 
//It is used to refer to the instance variables and methods of the current object within the class.
import java.util.Scanner;

public class Getter_Setter_127 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pen p1 =new Pen();
        // p1.color ="Blue";  in class Pen color is private so for accessing it we have to use getter and setter
        // getter and setter are 2  functions that are called in main function
        p1.setcolor("Blue");//setter
        //System.out.println(p1.color); we cant access it directly in class Pen 
        //color is private so for accessing it we have to use getter and setter
        System.out.println(p1.getcolor());
        p1.settip(5);
        System.out.println();
    }
}
class Pen{
    private String color;
    private int tip;
    void setcolor(String newcolor){
        this.color = newcolor;
    }
    String getcolor(){
        return this.color;
    }
    void settip(int tip){
        this.tip =tip;
    }
    int gettip(){
        return this.tip;
    }
}
