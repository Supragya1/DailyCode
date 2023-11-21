// Day103_Q1.java
// Java Currency Formatter HackerRank
import java.util.*;
import java.text.*;

public class java_currency_formatter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();
        //Locale indiaLocale = new Locale("en", "IN");
        Locale indiaLocale = new Locale.Builder().setLanguage("en").setRegion("IN").build();
        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);      
        System.out.println("US: "     + us.format(payment));
        System.out.println("India: "  + india.format(payment));
        System.out.println("China: "  + china.format(payment));
        System.out.println("France: " + france.format(payment));
    
    }
}
