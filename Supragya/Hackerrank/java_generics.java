// Day98_Q1.java
// Java Generics HackerRank
import java.util.*;
class Printer{
    void printarray(Object[] a){
        for(Object i:a){
            System.out.println(i);
        }
    }
}
public class java_generics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Printer print = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        print.printarray(intArray);
        print.printarray(stringArray);
    }
}
