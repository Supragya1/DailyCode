/* Exceptions -
    - CheckedException
    - UncheckedException
    - Error
    Throwable class
    /               \
Exception class(checked)     Error class
/
RuntimeException(unchecked) & IOException class

Class RuntimeException
java.lang.Object
java.lang.Throwable
java.lang.Exception
java.lang.RuntimeException
*/
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.imageio.IIOException;
public class Exceptions {
    public static void readFile(){
        try{
        var file = new FileReader("file.txt");
        int i;
        while ((i = file.read()) != -1) {
            System.out.print((char)i);
        }
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());

        }
    }
    public static void readFileArr(){
        try{
            var file = new FileReader("file.txt");
            char[] charArray = new char[1000];
            file.read(charArray);
            System.out.println(charArray);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void show(){
        sayName("Supragya");
        sayName(null);
        System.out.println("printing even after exception");
    }
    public static void sayName(String name){
        try{
        System.out.println(name.toLowerCase());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
            // e.printStackTrace();
        }
    }
    public static void main(String[] args) { 
        show();
        readFile();
        System.out.println("");
        readFileArr();
    }
}