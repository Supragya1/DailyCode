// Day85_Q1.java
// Java Method Overriding Hackerrank
import java.io.*;
import java.util.*;
class Generic_Sports{
    Generic_Sports(){
        // Default Constructor because Scoccer_Sports class is inheriting this class and
        // Scoccer_Sports class is calling this constructor using super() keyword implicitly
    }
    Generic_Sports(String str){
        System.out.println(str);
    }
    void Info(){
        System.out.println("Each team has n players in Generic Sports");
    }
}
class Soccer_Sports extends Generic_Sports{
    Soccer_Sports(){
        System.out.println("Soccer Class");
    }
    @Override
    void Info(){
        System.out.println("Each team has 11 players in Soccer Class");
    }
}
public class java_method_overriding {

    public static void main(String[] args) {
        Generic_Sports g1 = new Generic_Sports("Generic Sports");
        g1.Info();
        Soccer_Sports s1 = new Soccer_Sports();
        s1.Info();
    }
}
