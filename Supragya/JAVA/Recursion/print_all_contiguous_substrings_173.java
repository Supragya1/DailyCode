// Day128_Q2.java 
// Write a program to print all the contiguous substrings of a given string .
import java.util.Scanner;
public class print_all_contiguous_substrings_173 {
    static void print_substrings(String str,int i,int j,int count){
        if(i==str.length()){
            System.out.println("The number of contiguous substrings is: "+count);
            return;
        }
        if(j==str.length()){
            j=i+1;
            print_substrings(str, i+1, j, count);
        }
        else{
            System.out.println(str.substring(i,j+1));
            print_substrings(str, i, j+1, count+1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scan.nextLine();
        System.out.println("The contiguous substrings are: ");
        for(int i=0;i<str.length();i++){
            StringBuilder sb = new StringBuilder();
            for(int j=i;j<str.length();j++){
                sb.append(str.charAt(j));
                System.out.println(sb);
            }
        }
        System.out.println("The contiguous substrings are using recursion: ");
        print_substrings(str,0,0,0);
    }
}