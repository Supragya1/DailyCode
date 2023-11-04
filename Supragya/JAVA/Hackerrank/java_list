// Day89_Q1.java
// Java List Hackerrank
import java.util.*;
public class java_list {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       ArrayList<Integer> list = new ArrayList();
       for(int i=0;i<n;i++){
           list.add(scan.nextInt());
       }
       int m =scan.nextInt();
       scan.nextLine();
       for(int i=0;i<m;i++){
       if(scan.next().equals("Insert")){
           list.add(scan.nextInt(),scan.nextInt());
       }
       else{
           list.remove(scan.nextInt());
       }
       }
       for(int i:list){
           System.out.print(i+" ");
       }
    }
}