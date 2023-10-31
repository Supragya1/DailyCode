// Day86_Q1.java
// Java Abstract Class Hackerrank
import java.io.*;
import java.util.*;
abstract class Book{
    String title;
    public abstract void setTitle(String str);
    String getTitle(){
        return title;
    }
}
class MyBook extends Book{
    @Override
    public void setTitle(String str){
        this.title =str;
    }
}
public class java_abstract_class {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyBook b1 = new MyBook();
        String str = scan.nextLine();
        b1.setTitle(str);
        System.out.println("The title is: "+b1.getTitle());
    }
}
