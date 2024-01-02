// Day113_Q2.java
import java.util.*;
public class date_class_134 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(System.currentTimeMillis());
        System.out.println(date.getTime());
        System.out.println("Gives today's date"+date.getDate()); 
        System.out.println("gives today's day (1-7) "+date.getDay());
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getMonth());
        System.out.println(date.getSeconds());
        System.out.println(date.getTimezoneOffset());
        System.out.println(date.getYear());
        System.out.println(date.toString());
        System.out.println(date.toGMTString());
        System.out.println(date.toLocaleString());
        System.out.println(date.toInstant());
        System.out.println(date.toInstant().toString());
        System.out.println(date.toInstant().toEpochMilli());
        System.out.println(date.toInstant().getEpochSecond());
    }    
}
