// Day67_Q2.java
// Write a java program to find the number of days in a month.
import java.util.Scanner;
public class number_of_days_in_month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month: ");
        int month = sc.nextInt();
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        int days = 0;
        switch(month) {
            case 1: days = 31; break;
            case 2: if(year%4==0&&(year%100!=0||year%400==0)) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
            case 3: days = 31; break;
            case 4: days = 30; break;
            case 5: days = 31; break;
            case 6: days = 30; break;
            case 7: days = 31; break;
            case 8: days = 31; break;
            case 9: days = 30; break;
            case 10: days = 31; break;
            case 11: days = 30; break;
            case 12: days = 31; break;
            default: System.out.println("Invalid month");
        }
        System.out.println("Number of days in the month: " + days);
    }
}
