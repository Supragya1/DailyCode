// Day101_Q1.java
// Java Date and Time Hackerrank
import java.util.*;
import java.time.*;
class Result {
    public static String findDay(int month, int date, int year) {
       LocalDate day = LocalDate.of(year, month, date);
       return day.getDayOfWeek().toString(); 
    }
}

public class java_date_and_time {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        int date = scan.nextInt();
        int year = scan.nextInt();
        String day = Result.findDay(month,date,year);
        System.out.println(day);
    }
}