// Day41_Q1.java
// Q for a given string convert first letter of each word to uppercase
//  StringBuilder_name.append(ch) to add ch in last
//  ch2 =Character.toUpperCase(character);
//  objectname.toString(); to convert to string int cant be converted but Integer can char cannot but Character can etc
import java.util.Scanner;

public class Uppercase_111{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scan.nextLine();
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
                // ch = str.charAt(i);    ch =Character.toUpperCase(ch);  sb.append(ch);
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        sb.toString();
        System.out.println(sb);
    }
}
