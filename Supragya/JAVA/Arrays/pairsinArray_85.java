// Day4_Q1.java
// pairsinArray_85
import java.util.*;
public class pairsinArray_85 {
    public static void printpairs(int a[],int n){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print("("+a[i]+","+a[j]+") ");
                count++;
            }
            System.out.println("");
        }
            System.out.println("total pairs = "+count);
    }
   
}
