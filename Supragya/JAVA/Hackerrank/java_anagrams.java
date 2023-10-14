// Day81_Q2.java
// Java Anagrams Hackerrank
import java.io.*;
import java.util.*;

public class java_anagrams {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str2 = scan.nextLine();
        if(str.length()!=str2.length()){
            System.out.println("Not Anagrams");
            System.exit(0);
        }
        str=str.substring(0,str.length()).toUpperCase();
        str2=str2.substring(0,str2.length()).toUpperCase();
        char arr1[]= str.toCharArray();
        char arr2[]= str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int flag=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
}
