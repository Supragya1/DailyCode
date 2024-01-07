// Day119_Q1.java
// Types of constructors
// 1)Non Parameterised    2)Parameterised    3)copy constructor
public class Constructor_Types_130 {
    public static void main(String[] args) {
        // Non Parameterised Constructor
        Standard eleven = new Standard();
        eleven.number_of_sections= 10;
        eleven.Total_students=320;
        System.out.println("Total number of sections "+eleven.number_of_sections);
        System.out.println("Total number of students "+eleven.Total_students);

        // Parameterised Constructor
        Student s1 = new Student();
        Student s2 = new Student("Supragya",9.8f);
        Student s3 = new Student("Rohan");
        Student s4 = new Student(9.8f);
        Student s5 = new Student(9.3f,0.3f);
    }
}
class Standard{
    int number_of_sections;
    int Total_students;
    // Non Parameterised Constructor
    // Java will define a Non Parameterised Constructor itself if and only if we dont initialise any constructor
    // or we can call a constructor ourself
    Standard(){
        System.out.println("Constructor is called");
    }
}
// Constructor overloding is done in the below class . here we defined different constructors with same name but different 
// parameters.
/*Constructor overloading refers to the concept of having multiple constructors in a class, each with a different set of 
parameters. It allows you to create objects of a class with different initializations depending on the arguments passed 
to the constructor.
In Java, you can define multiple constructors in a class by giving them different parameter lists. 
The constructors can have different types and different numbers of parameters. When you create an object using the new 
keyword, the appropriate constructor is called based on the arguments provided. */
class Student{
    String name;
    float cgpa;
    Student(){
        System.out.println("Constructor is called");
    }
    Student(String name,float cgpa ){
        this.name = name;
        this.cgpa =cgpa;
    }
    Student(String name){
        this.name= name;
    }
    Student(float cgpa){
        this.cgpa=cgpa;
    }
    Student(float cgpa,float increment){
        this.cgpa=cgpa+increment;
    }
}