// Day114_Q2.java
import java.util.*;
public class gregorial_calendar_class_136 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.getCalendarType());
        System.out.println(cal.getTime());
        System.out.println(cal.getTimeZone());
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
        System.out.println(cal.isLeapYear(scan.nextInt())? "Leap Year":"Not a Leap Year");
        System.out.println(TimeZone.getDefault());
    }
}
