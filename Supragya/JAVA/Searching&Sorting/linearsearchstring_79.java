// Day8_Q1.java
// linearsearchstring_79
import java.util.*;
public class linearsearchstring_79 {
    public static int linearsearch(String menu[],String key){
        for(int i=0;i<menu.length;i++){
        if(menu[i]==key)
        return i;
        }
        return -1;
    }
    public static void main(String[]args){ 
        Scanner scan = new Scanner(System.in);
        String menu[] = {"dosa","chowmeins","burger","pasta","pizza"};
        String key = scan.next();
        int index = linearsearch(menu,key);
        if(index==-1){
            System.out.println("Index Not Found");
        }
        else
        System.out.println("key is at index "+ index);
        
    }
}
