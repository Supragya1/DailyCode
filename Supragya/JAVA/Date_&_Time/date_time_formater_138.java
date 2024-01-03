// Day115_Q2.java
import java.time.*;
import java.time.format.DateTimeFormatter;
public class date_time_formater_138 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        System.out.println(dt.getDayOfMonth());
        System.out.println(dt.getDayOfWeek());
        System.out.println(dt.getDayOfYear());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(dtf.format(dt));
        dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(dtf.format(dt));
    }
}
