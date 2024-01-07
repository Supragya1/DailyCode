// Day119_Q2.java
//A copy constructor is a special constructor in Java that allows creating a new object by copying the values of 
//another object of the same class. It is used to create a new instance with the same state as an existing object.
// destructor is a special method that is automatically called when an object is about to be destroyed or deallocated.
// Its purpose is to perform any necessary cleanup or resource release operations before the object is removed from memory.
// Java dont have destructors becz java do that job itself by using garbage collectors
// In Java, there is no explicit destructor concept like in some other programming languages such as C++. 
//Java handles object destruction through its garbage collection mechanism
import java.util.Scanner;

public class CopyConstructor_131 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student s1 = new Student();
        s1.name="Supragya";
        s1.age =19;
        s1.setpass("abcd");
        s1.marks[0]=93;
        s1.marks[1]=98;
        s1.marks[2]=95;
        // here copy constructor is called and use previous object as parameter
        Student s2 =new Student(s1);
        s2.setpass("xyz");
        Student s3 =new Student(s1,"abc");  
        System.out.println("s1.marks[1] = "+s1.marks[1]);
        s1.marks[1]=100;
        System.out.println("s1.marks[1] after changing = "+s1.marks[1]);
        System.out.println("s2.marks[1] = "+s2.marks[1]);// due to shallow copy the marks of s2 also changed
        System.out.println("s3.marks[1] = "+s3.marks[1]);// due to deep copy the marks of s3 didnt changed

    }   
}
class Student{
    String name;
    int age;
    private String password;
    int marks[];
    //  setter
    public void setpass(String password){
        this.password=password;
    }
    Student(){
        marks = new int[3];
    }
    // copy constructor is being called  (shallow copy constructor)
    Student(Student s1){
        marks = new int[3];
        this.name =s1.name;
        this.age =s1.age;
        this.marks = s1.marks; // shallow copy (copy by refrence)
    }
    // copy constructor is being called  (Deep copy constructor)
    Student(Student s1,String password){
        marks = new int[3];
        this.name =s1.name;
        this.age =s1.age;
        this.password=password;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];  // deep copy (full values copy)
        }
    }

}