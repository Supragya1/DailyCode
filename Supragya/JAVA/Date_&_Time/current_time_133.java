// Day113_Q1.java
// In Java Time is measured in Milliseconds since 1st Jan 1970
public class current_time_133 {
    public static void main(String[] args) {
        System.out.println("Current Time in Nanoseconds = "+ System.nanoTime());
        System.out.println("Current Time in Milliseconds = "+ System.currentTimeMillis());
        System.out.println("Current Time in Seconds = "+ System.currentTimeMillis()/1000);
        System.out.println("Current Time in Minutes = "+ System.currentTimeMillis()/1000/60);
        System.out.println("Current Time in Hours = "+ System.currentTimeMillis()/1000/60/60);
        System.out.println("Current Time in Days = "+ System.currentTimeMillis()/1000/60/60/24);
        System.out.println("Current Time in Years = "+ System.currentTimeMillis()/1000/60/60/24/365);
    }    
}
