// Day96_Q1.java
// Java BigDecimal HackerRank
import java.math.*;
import java.util.*;

public class java_bigdecimal{

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        scan.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String temp = scan.nextLine();
            list.add(temp);
        }
        list.sort((String s1,String s2)->{
            BigDecimal d1 = new BigDecimal(s1);
            BigDecimal d2 = new BigDecimal(s2);
            return d2.compareTo(d1);
        });
    Iterator<String> itr = list.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
    }
}
