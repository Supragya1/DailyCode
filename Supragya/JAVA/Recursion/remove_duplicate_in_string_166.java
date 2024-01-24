// Day112_Q1.java
import java.util.*;
public class remove_duplicate_in_string_166 {
    public static String removeDuplicate(String str , HashMap<Character, Integer> map,int index,StringBuilder str2){
        if(str.length()==index){
            return str2.toString();
        }
        if(map.containsKey(str.charAt(index))){
            return removeDuplicate(str,map,index+1,str2);
        }
        else{
            map.put(str.charAt(index), 1);
            str2.append(str.charAt(index)); 
            return removeDuplicate(str,map,index+1,str2);
        }
    }
    public static String removeDuplicate2(String str,HashMap<Character,Integer> map,int i){
        if(i==str.length()){
            return str;
        }
        if(map.containsKey(str.charAt(i))){
            return removeDuplicate2(str.substring(0, i)+str.substring(i+1, str.length()), map, i+1);
        }
        else{
            map.put(str.charAt(i), 1);
            return removeDuplicate2(str, map, i+1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=scan.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder str2 = new StringBuilder();
        System.out.println("The string after removing duplicate characters is "+removeDuplicate(str, map,0,str2));
        System.out.println("The string after removing duplicate characters is "+removeDuplicate2(str, map,0));
    }
}
