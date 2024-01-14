// Day126_Q1.java
// Print all binary string of size N without consecutive 1's
import java.util.Scanner;
public class Binary_String_168 {
    static void printBinaryString(int n,int last, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinaryString(n-1, 0, str+"0");
        if(last == 0){
            printBinaryString(n-1, 1, str+"1");
        }
        // if(last == 0){
        //     printBinaryString(n-1, 0, str+"0");
        //     printBinaryString(n-1, 1, str+"1");
        // }
        // else{
        //     printBinaryString(n-1, 0, str+"0");
        // }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of binary string: ");
        int n = scan.nextInt();
        String output = "";
        printBinaryString(n,0,output);
    }
}
