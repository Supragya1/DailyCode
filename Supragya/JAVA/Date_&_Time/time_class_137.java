// Day115_Q1.java
import java.time.*;
public class time_class_137 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getYear());
        System.out.println(date.isLeapYear());
        System.out.println(date.plusDays(10));
        System.out.println(date.plusMonths(10));
        System.out.println(date.plusYears(10));
        System.out.println(date.minusDays(10));
        System.out.println(date.minusMonths(10));
        System.out.println(date.minusYears(10));
        System.out.println(date.withDayOfMonth(10));
        System.out.println(date.withDayOfYear(10));
        System.out.println(date.withMonth(10));
        System.out.println(date.withYear(10));
        System.out.println(date.withYear(10));
        System.out.println(date.withYear(10));
        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getHour()+":"+time.getMinute()+":"+time.getSecond());
    }
}
