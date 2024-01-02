import java.util.*;
import java.text.*;
public class calendar_class_135 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getCalendarType());
        System.out.println(cal.getTime());
        System.out.println(cal.getTimeZone());
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));  
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
        System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
        Date date = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(sdf.format(date));
    }
}
