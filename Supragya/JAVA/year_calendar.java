// Day67_Q1.java
// Write a java program to build a year calendar for a given year.
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;
public class year_calendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt(); 

        System.out.println("Calendar for Year " + year + "\n");

        for (Month month : Month.values()) {
            System.out.println(month + " " + year);
            System.out.println("---------------");
            System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");

            LocalDate date = LocalDate.of(year, month, 1);

            int dayOfWeek = date.getDayOfWeek().getValue();
            for (int i = 1; i < dayOfWeek; i++) {
                System.out.print("   ");
            }

            while (date.getMonth() == month) {
                System.out.printf("%3d", date.getDayOfMonth());

                if (date.getDayOfWeek().getValue() == 6) {
                    System.out.println();
                } else {
                    System.out.print("  "); 
                }

                date = date.plusDays(1);
            }

            System.out.println("\n");
        }
    }
}
