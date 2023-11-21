// Day88_Q1.java
// Java ArrayList Hackerrank
import java.util.*;
public class java_arraylist {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<ArrayList<Integer>> outerlist = new ArrayList();
        for(int i=0;i<n;i++){
            ArrayList<Integer> innerlist = new ArrayList();
            int m= scan.nextInt();
            for(int j=0;j<m;j++){
                innerlist.add(scan.nextInt());
            }
            outerlist.add(innerlist);
        }
        int query = scan.nextInt();
        for(int i=0;i<query;i++){
            int q1 = scan.nextInt()-1;
            int q2 = scan.nextInt()-1;
            if(q1>=0 && q1<outerlist.size() && q2>=0 && q2<outerlist.get(q1).size()){
                System.out.println(outerlist.get(q1).get(q2));
            }
            else{
                System.out.println("ERROR!");
            }
        }
    }
}