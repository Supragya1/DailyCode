// Day92_Q1.java
// Java Map Hackerrank
import java.util.*;
public class java_map {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<>();
        long n= scan.nextInt();
        scan.nextLine();
        for(long i=0;i<n;i++){
            String key = scan.nextLine();
            Integer value = scan.nextInt();
            map.put(key,value);
            scan.nextLine();
        }
        for(long i=0;i<n;i++){
            String key = scan.nextLine();
        if(map.containsKey(key)){
            System.out.println(key+"="+map.get(key));
        }
        else{
            System.out.println("Not found");
        }
        }
    }
}
