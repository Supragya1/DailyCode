// Day128_Q1.java
// We are given a string S, we need to find the count of all contiguous substrings starting and ending with the same character.
import java.util.Scanner;
public class Contiguous_substrings_same_start_end_172 {
    static int count(String str,int i,int j,int count){
        if(i==str.length()){
            return count;
        }
        if(j==str.length()){
           return count(str,i+1,i+1,count);
        }
        else if(str.charAt(i)==str.charAt(j)){
            return count(str, i, j+1, count+1);
        }
        else {
            return count(str,i,j+1,count);
        }        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scan.nextLine();
        System.out.println("The contiguous substrings are with same start and end character are: ");
        int c=0;
        for(int i=0;i<str.length();i++){
            StringBuilder sb = new StringBuilder();
            for(int j=i;j<str.length();j++){
                sb.append(str.charAt(j));
                if(str.charAt(i)==str.charAt(j)){
                c++;
                System.out.println(sb);
                }
            }
        }
        System.out.println("The number of contiguous substrings starting and ending with the same character is: "+c);
        System.out.println("The number of contiguous substrings starting and ending with the same character is: "+count(str,0,0,0));
    }
}
