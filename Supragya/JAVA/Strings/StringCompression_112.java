// Day41_Q2.java
// StringCompression_112.java
import java.util.Scanner;
public class StringCompression_112 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scan.next();
        String newstr = "";
        Integer count =0;
        for(int i=0;i<str.length();i++){
            count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            //either 
            newstr+=str.charAt(i);
            if(count>1){
                newstr+=count.toString();
            }
            // or 
            System.out.print(str.charAt(i)+""+count);
        }
        System.out.print("\n"+newstr);
    }
}

/* or
 * import java.util.Scanner;

public class StringCompression_112 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scan.next();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                System.out.println(str.charAt(i) + "" + count);
                count = 1;
            }
        }
        // Print the last character and its count
        System.out.println(str.charAt(str.length() - 1) + "" + count);
    }
}

 */